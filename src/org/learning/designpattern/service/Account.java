package org.learning.designpattern.service;

class Account {
    private int balance;
    private static Account account;

    private Account() {}

    static Account getAccount() {
        if(account == null) {
            account = new Account();
            account.setBalance(30000);
        }
        return account;
    }

    int getBalance() {
        return balance;
    }

    void setBalance(int balance) {
        this.balance = balance;
    }
}
