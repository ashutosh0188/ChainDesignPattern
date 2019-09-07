package org.learning.designpattern.dao;

/**
 * {@link CustomerAccount } holds the cash availability information of a customer account at any given point.
 * In real time scenario this class can be a DAO layer to get data from DB. Since DB is common
 * for each request at any given point. So to get this functionality, This class has been designed
 * as Singleton.
 *
 * @author Ashutosh Srivastava
 */
public class CustomerAccount {
    private int balance;
    private static CustomerAccount account;

    private CustomerAccount() {}

    public static CustomerAccount getAccount() {
        if(account == null) {
            account = new CustomerAccount();
            account.setBalance(30000);
        }
        return account;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
