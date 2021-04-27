package cn.spring.learn.collectionType;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Pi
 * @date 2021-04-26 15:56
 */
public class StudentTest {
    @Test
    public void test_collection_type() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("collectionTypeBean.xml");
        Student student = context.getBean("stu", Student.class);
        System.out.println(student);
    }
}
