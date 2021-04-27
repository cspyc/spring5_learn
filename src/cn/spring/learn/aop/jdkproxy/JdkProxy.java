package cn.spring.learn.aop.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author Pi
 * @date 2021-04-27 15:31
 */
public class JdkProxy {

    public static void main(String[] args) {
        //创建接口实现类代理对象
        Class[] interfaces = {DaoService.class};
//        Proxy.newProxyInstance(JdkProxy.class.getClassLoader(),
//                interfaces, new InvocationHandler() {
//                    @Override
//                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                        return null;
//                    }
//                });

        DaoImpl dao = new DaoImpl();
        DaoService service = (DaoService) Proxy.newProxyInstance(JdkProxy.class.getClassLoader(), interfaces, new DaoImplProxy(dao));
        service.add(1, 2);
    }
}

//创建代理对象

class DaoImplProxy implements InvocationHandler {

    //把创建的是谁的代理对象，把谁传递过来
    //通过有参构造传递
    private Object obj;

    public DaoImplProxy(Object obj) {
        this.obj = obj;
    }

    //增加的逻辑
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //方法之前
        System.out.println("方法执行前...." + method.getName() + ";传递的参数...." + Arrays.toString(args));

        //被增强的方法执行
        Object result = method.invoke(obj, args);

        //方法之后
        System.out.println("方法执行之后......" + obj);
        return result;
    }
}
