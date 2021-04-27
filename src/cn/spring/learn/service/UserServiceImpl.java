package cn.spring.learn.service;

import cn.spring.learn.User;
import cn.spring.learn.dao.UserDao;
import cn.spring.learn.dao.UserDaoImpl;

/**
 * @author Pi
 * @date 2021-04-26 13:19
 */
public class UserServiceImpl implements UserService {

    //创建UserDao类型属性，生成set方法
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void add() {
        System.out.println("Service add .........");
        userDao.update();
        //原始方式
//        UserDao userDao = new UserDaoImpl();
//        userDao.update();
    }
}
