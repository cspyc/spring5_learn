package cn.spring.learn.transaction.entity;

/**
 * @author Pi
 * @date 2021-05-01 15:29
 */
public class Account {
    private int id;
    private String name;
    private double balance;

    public Account(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
