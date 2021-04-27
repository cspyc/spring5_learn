package cn.spring.learn.annotation;

import cn.spring.learn.annotation.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Pi
 * @date 2021-04-26 21:34
 */
public class UerServiceTest {
    @Test
    public void test_add() throws Exception {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotationTest.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(cn.spring.learn.annotation.springConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }
}
