package org.learning.designpattern.handler;

public interface Operation {
    public void deposit(int amount);
    public int checkBalance();
    public void withdraw(int amount);
}
