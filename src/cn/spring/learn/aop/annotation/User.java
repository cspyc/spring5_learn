package cn.spring.learn.aop.annotation;

import org.springframework.stereotype.Component;

/**
 * @author Pi
 * @date 2021-04-27 17:00
 */
//被增强功能的类
@Component
public class User {
    public void add() {
//        int i = 10/0;
        System.out.println("执行add操作。。。。。。");
    }
}
