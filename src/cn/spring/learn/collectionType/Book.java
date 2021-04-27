package cn.spring.learn.collectionType;

import java.util.List;

/**
 * @author Pi
 * @date 2021-04-26 17:14
 */
public class Book {
    private List<String> list;

    public void setList(List<String> list) {
        this.list = list;
        System.out.println("第二步：通过setter方法设置属性值");
    }

    public Book() {
        System.out.println("第一步：通过构造器创建对象");
    }

    public void initialMethod(){
        System.out.println("第三步：运行初始化方法");
    }

    public void destroyMethod(){
        System.out.println("第五步：容器销毁后，运行销毁方法");
    }
    @Override
    public String toString() {
        return "Book{" +
                "list=" + list +
                '}';
    }
}
