package cn.spring.learn.collectionType;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Pi
 * @date 2021-04-26 17:17
 */
public class BookTest {
    @Test
    public void book_test_demo() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("collectionTypeCommonBean.xml");
        Book book = context.getBean("book", Book.class);
//        Book book1 = context.getBean("book", Book.class);
        System.out.println("第四步：获取创建的对象");
//        System.out.println(book.hashCode());
//        System.out.println(book1.hashCode());

        ((ClassPathXmlApplicationContext) context).close();
    }
}
