package cn.spring.learn.company;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Pi
 * @date 2021-04-26 14:19
 */
public class TestCompanyInline {
    @Test
    public void test_inner_bean() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("companyInlineBean.xml");
        Emp emp = context.getBean("emp",Emp.class);
        System.out.println(emp);
    }
}
