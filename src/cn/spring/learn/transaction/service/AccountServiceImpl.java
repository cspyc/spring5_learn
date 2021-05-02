package cn.spring.learn.transaction.service;

import cn.spring.learn.transaction.dao.AccountDao;
import cn.spring.learn.transaction.dao.AccountDaoImpl;
import cn.spring.learn.transaction.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * @author Pi
 * @date 2021-05-01 15:28
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class AccountServiceImpl implements AccountService {

    private AccountDaoImpl accountDao;

    public AccountServiceImpl(AccountDaoImpl accountDao) {
        this.accountDao = accountDao;
    }

    public void transferMoney(Account from, Account to, double money) {
//        //使用编程方式处理
//        //1.开启事务
//
//        //2.进行业务操作
//        try {
        accountDao.reduceMoney(from, money);
        int i = 10 / 0;
        accountDao.addMoney(to, money);
        //3.没有异常，提交事务
//        } catch (Exception e) {
//            //4.捕获异常，事务回滚
//        }

    }
}
