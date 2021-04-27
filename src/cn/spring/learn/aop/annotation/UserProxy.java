package cn.spring.learn.aop.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author Pi
 * @date 2021-04-27 17:01
 */
//增强功能的类
@Component
@Aspect //生成代理对象
@Order(2)
public class UserProxy {

    @Pointcut("execution(* cn.spring.learn.aop.annotation.User.add(..))")
    public void commonPoint(){

    }
    //前置通知
    @Before("commonPoint()")
    public void enhanceAddBefore() {
        System.out.println("增强方法执行Before。。。。。");
    }

    //最终通知：即使发生异常也会执行
    @After("execution(* cn.spring.learn.aop.annotation.User.add(..))")
    public void after() {
        System.out.println("After。。。。。");
    }

    //后置通知/返回通知:如果发生异常则不会执行
    @AfterReturning("execution(* cn.spring.learn.aop.annotation.User.add(..))")
    public void AfterReturning() {
        System.out.println("AfterReturning。。。。。");
    }

    //异常通知：程序发生异常后会执行
    @AfterThrowing("execution(* cn.spring.learn.aop.annotation.User.add(..))")
    public void AfterThrowing() {
        System.out.println("AfterThrowing。。。。。");
    }
     //环线通知
    @Around("execution(* cn.spring.learn.aop.annotation.User.add(..))")
    public void Around(ProceedingJoinPoint pro) throws Throwable {
        System.out.println("环绕之前......");
        //被增强的方法执行
        pro.proceed();
        System.out.println("环绕之后......");
    }

}
