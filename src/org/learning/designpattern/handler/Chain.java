package org.learning.designpattern.handler;

/**
 * An interface that represent what can be a process while withdrawing money.
 * It will be decided at run time.
 * @author Ashutosh Srivastava
 */
public interface Chain {
    void process(int amount, DispenseCurrency dispenseCurrency);
    void next(Chain chain);
}
