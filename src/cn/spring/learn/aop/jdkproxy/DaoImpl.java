package cn.spring.learn.aop.jdkproxy;

/**
 * @author Pi
 * @date 2021-04-27 15:29
 */
public class DaoImpl implements DaoService {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public String update(String id) {
        return id;
    }
}
