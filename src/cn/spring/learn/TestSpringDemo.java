package cn.spring.learn;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Pi
 * @date 2021-04-25 20:38
 */
public class TestSpringDemo {
    @Test
    public void testAdd() throws Exception {
        //加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        //创建配置文件中的对象
        User user = context.getBean("user", User.class);
        user.add();

    }
}
