package cn.spring.learn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Pi
 * @date 2021-04-26 11:42
 */
public class TestBookDemo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bookBean.xml");
        //先创建对象
        Book book = context.getBean("book", Book.class);
        System.out.println(book.toString());
    }
}
