package cn.spring.learn;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Pi
 * @date 2021-04-26 12:43
 */
public class TestOrderDemo {

    @Test
    public void testOrderDemo() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("orderBean.xml");
        Order order = context.getBean("order", Order.class);
        System.out.println(order);
    }
}
