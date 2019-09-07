package org.learning.designpattern.service;

import org.learning.designpattern.handler.Operation;

final class OperationService implements Operation  {
    private static OperationService operationService;
    private OperationService() {}

    static OperationService getInstance() {
        if(operationService==null) {
            operationService = new OperationService();
        }
        return operationService;
    }

    @Override
    public void deposit(int amount) {
        Account account = Account.getAccount();
        int available = account.getBalance();
        available = available + amount;
        account.setBalance(available);
    }

    @Override
    public int checkBalance() {
        return Account.getAccount().getBalance();
    }

    @Override
    public void withdraw(int amount) {

    }
}
