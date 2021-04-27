package cn.spring.learn.collectionType;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;

/**
 * @author Pi
 * @date 2021-04-26 19:34
 */
public class MyBeanProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("在初始化之前方法的步骤：把bean的实例传递给bean后置处理器的方法-postProcessBeforeInitialization");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("在初始化之后方法的步骤：把bean的实例传递给bean后置处理器的方法-postProcessAfterInitializaiton");
        return bean;
    }

}
