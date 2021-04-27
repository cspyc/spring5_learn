package cn.spring.learn.annotation.service;

import cn.spring.learn.annotation.dao.UserDao;
import com.alibaba.druid.support.json.JSONUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Pi
 * @date 2021-04-26 21:29
 */
//在注解里面 value属性值可以省略不写，默认值是类名称，首字母小写
@Service(value = "userService") //相当于 <bean id = "userService ...>
public class UserService {

    @Value(value = "abc")
    private String name;

    //定义dao类型属性
    //不需要添加set方法
    //添加注入属性注解
//    @Autowired//根据类型注入-如果有两个UserDao接口实现类，不指定具体名称，会找不到类
//    @Qualifier(value = "userDaoImplV2") //根据对象名称进行注入

    //    @Resource//根据类型注入
    @Resource(name = "userDaoImplV2")//根据名称进行注入
    private UserDao userDao;

    public void add() {
        System.out.println("UserService add method()......." + "name:" + name);
        userDao.update();
    }
}
