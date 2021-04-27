package cn.spring.learn.annotation.dao;

import org.springframework.stereotype.Repository;

/**
 * @author Pi
 * @date 2021-04-26 22:07
 */
@Repository(value = "userDaoImplV2")
public class UserDaoImplV2 implements UserDao {

    @Override
    public void update() {
        System.out.println("userDaoImpl V2 update......");
    }
}
