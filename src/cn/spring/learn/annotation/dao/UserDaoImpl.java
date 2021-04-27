package cn.spring.learn.annotation.dao;

import org.springframework.stereotype.Repository;

/**
 * @author Pi
 * @date 2021-04-26 21:56
 */
@Repository(value = "userDaoImplV1")
public class UserDaoImpl implements UserDao {
    @Override
    public void update() {
        System.out.println("userDao update.....");
    }
}
