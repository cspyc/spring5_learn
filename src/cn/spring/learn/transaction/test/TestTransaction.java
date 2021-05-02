package cn.spring.learn.transaction.test;

import cn.spring.learn.transaction.entity.Account;
import cn.spring.learn.transaction.service.AccountService;
import cn.spring.learn.transaction.service.AccountServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

/**
 * @author Pi
 * @date 2021-05-01 15:51
 */
public class TestTransaction {
    @Test
    public void test_transfer() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("cn/spring/learn/transaction/config/transaction.xml");
        AccountService service = context.getBean("accountServiceImpl", AccountService.class);
        Account lily = new Account(1, "lily");
        Account tom = new Account(2, "tom");
        service.transferMoney(lily, tom, 100);
    }

    @Test
    public void test_transfer_xml() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("cn/spring/learn/transaction/config/transaction_xml.xml");
        AccountService service = context.getBean("accountServiceImpl", AccountService.class);
        Account lily = new Account(1, "lily");
        Account tom = new Account(2, "tom");
        service.transferMoney(lily, tom, 100);
    }

    @Test
    public void test_transfer_totally_annotation() throws Exception {
        ApplicationContext context = new AnnotationConfigApplicationContext("cn.spring.learn.transaction.config");
        AccountService service = context.getBean("accountServiceImpl", AccountService.class);
        Account lily = new Account(1, "lily");
        Account tom = new Account(2, "tom");
        service.transferMoney(lily, tom, 100);
    }

    //    函数式风格创建对象，交给spring进行管理
    @Test
    public void test_genericApplicationContext() throws Exception {
        //1.创建genericApplicationContext对象
        GenericApplicationContext genericApplicationContext = new GenericApplicationContext();
        //2.创建User对象，注册到spring容器中
        genericApplicationContext.refresh();//清空
        genericApplicationContext.registerBean("user", User.class, () -> new User());//为对象设置一个名字
        //3.从spring容器中，获取注册的对象
//        User user = (User) genericApplicationContext.getBean("cn.spring.learn.transaction.test.User");
        User user = (User) genericApplicationContext.getBean("user");
        System.out.println(user);
    }
}
