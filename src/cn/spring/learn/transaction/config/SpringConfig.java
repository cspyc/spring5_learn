package cn.spring.learn.transaction.config;

import com.alibaba.druid.filter.Filter;
import com.alibaba.druid.filter.logging.Slf4jLogFilter;
import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Pi
 * @date 2021-05-02 15:01
 */
@Configuration
@ComponentScan(basePackages = {"cn.spring.learn.transaction"})//开启组件扫描
@EnableTransactionManagement//开启事务管理器
public class SpringConfig {

    //注入druid数据源
    @Bean
    public DruidDataSource getDruidDataSource() throws SQLException {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        druidDataSource.setUrl("jdbc:mysql://localhost:3306/spring_transaction_demo");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("pyc123");

        //配置日志打印
        druidDataSource.setFilters("stat,wall");
        List<Filter> filters = new ArrayList<>();
        Slf4jLogFilter filter = new Slf4jLogFilter();
        //开启语句打印
        filter.setStatementLogEnabled(true);
        filter.setStatementExecutableSqlLogEnable(true);
        filters.add(filter);
        druidDataSource.setProxyFilters(filters);
        return druidDataSource;
    }

    //注入jdbcTemplate
    @Bean
    public JdbcTemplate getJdbcTemplate(DataSource dataSource) {
        //在IOC容器中根据类型找到dataSource自动注入
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        //注入dataSource
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate;
    }

    //配置事务管理器
    @Bean
    public TransactionManager setTransactionManager(DataSource dataSource) {
        TransactionManager transactionManager = new DataSourceTransactionManager(dataSource);
        return transactionManager;
    }
}
