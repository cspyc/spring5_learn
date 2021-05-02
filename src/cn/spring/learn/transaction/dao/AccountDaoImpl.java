package cn.spring.learn.transaction.dao;

import cn.spring.learn.transaction.entity.Account;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author Pi
 * @date 2021-05-01 15:29
 */
@Repository
public class AccountDaoImpl implements AccountDao {
    private JdbcTemplate jdbcTemplate;

    public AccountDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void addMoney(Account account, double money) {
        String addSql = "update account set balance = balance + ? where id = ?";
        Object[] args = {money, account.getId()};
        jdbcTemplate.update(addSql, args);
    }

    @Override
    public void reduceMoney(Account account, double money) {
        String reduceSql = "update account set balance = balance - ? where id = ?";
        Object[] args = {money, account.getId()};
        jdbcTemplate.update(reduceSql, args);
    }
}
