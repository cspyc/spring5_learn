package cn.spring.learn.aop.annotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Pi
 * @date 2021-04-27 17:15
 */
public class TestUser {
    @Test
    public void test_aop() throws Exception {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aopAnnotation.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(cn.spring.learn.aop.config.AopConfig.class);
        User user = context.getBean("user", User.class);

        user.add();
    }
}
