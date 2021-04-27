package cn.spring.learn.collectionType;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Pi
 * @date 2021-04-26 17:34
 */
public class MybeanTest {
    @Test
    public void factory_bean_test() throws Exception {

        ApplicationContext context = new ClassPathXmlApplicationContext("FactoryBeanTest.xml");
        Course course = context.getBean("myBean", Course.class);
        System.out.println(course);
    }
}
