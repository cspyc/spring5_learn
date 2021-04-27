package cn.spring.learn.aop.xml;

/**
 * @author Pi
 * @date 2021-04-27 18:53
 */
public class BookProxy {
    //使用xml配置文件
    public void before() {
        System.out.println("买书前要记得带钱。。。。。");
    }
}
