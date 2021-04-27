package cn.spring.learn.factorybean;

import cn.spring.learn.collectionType.Course;
import org.junit.runner.manipulation.Ordering;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author Pi
 * @date 2021-04-26 17:33
 */
public class MyBean implements FactoryBean<Course> {

    @Override
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setCourseName("abc");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
