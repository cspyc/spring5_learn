package cn.spring.learn.aop.xml;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Pi
 * @date 2021-04-27 22:40
 */
public class BookTest {
    @Test
    public void test_xml_aop_config() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("aopXml.xml");
        Book book = context.getBean("book", Book.class);
        book.buy();
    }
}
