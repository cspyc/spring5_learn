package cn.spring.learn.test;

import cn.spring.learn.transaction.config.SpringConfig;
import cn.spring.learn.transaction.entity.Account;
import cn.spring.learn.transaction.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Pi
 * @date 2021-05-02 16:23
 */
@RunWith(SpringJUnit4ClassRunner.class)//单元测试框架
//@ContextConfiguration("classpath:cn/spring/learn/transaction/config")//加载配置文件
@ContextConfiguration(classes = SpringConfig.class)//加载配置文件
public class SpringTestJunit4 {
    @Autowired
    private AccountService accountService;

    public SpringTestJunit4() {
    }

    @Test
    public void test_junit4() throws Exception {
        Account lily = new Account(1, "lily");
        Account tom = new Account(2, "tom");
        accountService.transferMoney(lily, tom, 100);
    }
}
