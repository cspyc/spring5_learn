package cn.spring.learn;

import cn.spring.learn.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Pi
 * @date 2021-04-26 13:28
 */
public class TestServiceInjection {
    @Test
    public void testInjectObject() throws Exception {
        //加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("userServiceBean.xml");

        //获取配置创建的对象
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }
}
