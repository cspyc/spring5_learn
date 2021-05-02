package cn.spring.learn.transaction.dao;

import cn.spring.learn.transaction.entity.Account;

/**
 * @author Pi
 * @date 2021-05-01 15:28
 */
public interface AccountDao {

    void addMoney(Account account, double money);

    void reduceMoney(Account account, double money);
}
