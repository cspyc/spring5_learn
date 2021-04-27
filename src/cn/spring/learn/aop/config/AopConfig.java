package cn.spring.learn.aop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author Pi
 * @date 2021-04-27 22:47
 */
@Configuration
@ComponentScan(basePackages = {"cn.spring.learn.aop"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AopConfig {
}
