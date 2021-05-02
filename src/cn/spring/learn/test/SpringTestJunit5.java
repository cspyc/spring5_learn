package cn.spring.learn.test;

import cn.spring.learn.transaction.config.SpringConfig;
import cn.spring.learn.transaction.entity.Account;
import cn.spring.learn.transaction.service.AccountService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

//@ExtendWith(SpringExtension.class)
//@ContextConfiguration(classes = SpringConfig.class)//加载配置文件

@SpringJUnitConfig(classes = SpringConfig.class)
public class SpringTestJunit5 {
    @Autowired
    private AccountService accountService;

    public SpringTestJunit5() {
    }

    @Test
    public void test_junit5() throws Exception {
        Account lily = new Account(1, "lily");
        Account tom = new Account(2, "tom");
        accountService.transferMoney(lily, tom, 100);
    }
}
