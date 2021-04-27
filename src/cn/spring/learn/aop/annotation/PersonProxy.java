package cn.spring.learn.aop.annotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author Pi
 * @date 2021-04-27 18:38
 */
@Component
@Aspect
@Order(1)
public class PersonProxy {

    @Before("execution(* cn.spring.learn.aop.annotation.User.add(..))")
    public void add() {
        System.out.println("PersonProxy......");
    }
}
