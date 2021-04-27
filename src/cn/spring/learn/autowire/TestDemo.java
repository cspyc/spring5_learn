package cn.spring.learn.autowire;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Pi
 * @date 2021-04-26 20:08
 */
public class TestDemo {
    @Test
    public void test_autowire() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowireDemoBean.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
    }
}
