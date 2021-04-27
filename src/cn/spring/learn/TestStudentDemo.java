package cn.spring.learn;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Pi
 * @date 2021-04-26 12:54
 */
public class TestStudentDemo {
    @Test
    public void testStudent() throws Exception {

        ApplicationContext context = new ClassPathXmlApplicationContext("studentBean.xml");
        Student student = context.getBean("student", Student.class);
        System.out.println(student);

    }
}
