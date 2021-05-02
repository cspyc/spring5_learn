package cn.spring.learn.transaction.service;

import cn.spring.learn.transaction.entity.Account;

/**
 * @author Pi
 * @date 2021-05-01 15:28
 */
public interface AccountService {

    void transferMoney(Account from, Account to,double money);
}
