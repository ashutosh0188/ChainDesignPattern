package org.learning.designpattern.service;

/**
 * Basic operations that a customer can perform at an ATM Machine
 * @author Ashutosh Srivastava
 */
public interface AccountOperations {
    void deposit(int amount);
    int checkBalance();
    void withdraw(int amount);
}
