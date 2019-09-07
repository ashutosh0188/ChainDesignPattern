package org.learning.designpattern.service;

import org.learning.designpattern.dao.CustomerAccount;

/**
 * Implementation class of AccountOperations.
 * This class follows singleton design pattern to avoid creating instance again and again.
 * Since this is the direct interaction point of {@link ATMService} class
 * This class is designed to separate the business logic of actual functions of an ATM.
 * @author Ashutosh Srivastava
 */
final class AccountOperationsImpl implements AccountOperations {
    private static AccountOperationsImpl accountOperationsImpl;
    private AccountOperationsImpl() {}

    static AccountOperationsImpl getInstance() {
        if(accountOperationsImpl ==null) {
            accountOperationsImpl = new AccountOperationsImpl();
        }
        return accountOperationsImpl;
    }

    @Override
    public void deposit(int amount) {
        CustomerAccount account = CustomerAccount.getAccount();
        int available = account.getBalance();
        available = available + amount;
        account.setBalance(available);
    }

    @Override
    public int checkBalance() {
        return CustomerAccount.getAccount().getBalance();
    }

    @Override
    public void withdraw(int amount) {
        int currentBalance = CustomerAccount.getAccount().getBalance();
        int remainingBalance = currentBalance - amount;
        CustomerAccount.getAccount().setBalance(remainingBalance);
    }
}
