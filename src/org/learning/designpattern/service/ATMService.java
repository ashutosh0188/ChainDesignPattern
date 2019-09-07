package org.learning.designpattern.service;

import org.learning.designpattern.dao.ATMCash;
import org.learning.designpattern.handler.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * {@link ATMService} class is the entry point for client.
 * This class provides basic functionality for different types of operations.
 * @author Ashutosh Srivastava
 */
public class ATMService {
    public ATMService() {}

    /**
     * This method read user input as amount to deposit and
     * validates it, before saving it.
     */
    public void processDeposit() {
        System.out.println("Please enter amount to deposit:");
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()) {
            int x = scanner.nextInt();
            if(x<=0) {
                System.out.println("Please enter amount greater than 0.");
                return;
            }
            AccountOperationsImpl.getInstance().deposit(x);
            System.out.println("Your money deposited successfully!");
            System.out.println("Available balance: " + AccountOperationsImpl.getInstance().checkBalance());
        } else {
            System.out.println("Please enter valid amount.");
        }
    }

    /**
     * This method read user input as amount to deposit and
     * validates it, before withdraw.
     * It contains main logic for Chain Of Responsibility design pattern.
     * In this design pattern, we basically created all the handlers of currency.
     * Then assign them with next handler in chain, except the last one.
     * And then invoke the first one.
     * The main point to consider here is, the order of Currency Handler,
     * To make ATM more robust, while dispensing cash, We need to start counting currency from higher available currency
     * and then go further with decreasing order. And it guarantees to dispense all available cash from ATM, if customer
     * has entered lesser or equal cash  available in the ATM Machine, to withdraw.
     * So changing order may create unpredictable results.
     */
    public void processWithdraw() {
        System.out.println("Please enter amount to withdraw:");
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()) {
            int withdrawAmount = scanner.nextInt();
            if(withdrawAmount<=0) {
                System.out.println("Please enter amount greater than 0.");
                return;
            }
            if(ATMCash.getInstance().getAvailableCash() < withdrawAmount) {
                System.out.println("ATM is out of cash. Unable to dispense.");
                return;
            }
            if(AccountOperationsImpl.getInstance().checkBalance() < withdrawAmount) {
                System.out.println("You don't have sufficient balance");
                return;
            }
            if(withdrawAmount%100!=0) {
                System.out.println("Please enter amount multiple of 100.");
                return;
            }

            List<Chain> chains = new ArrayList<>();
            chains.add(new CurrencyHandler2000());
            chains.add(new CurrencyHandler1000());
            chains.add(new CurrencyHandler500());
            chains.add(new CurrencyHandler200());
            chains.add(new CurrencyHandler100());

            for(int i=0; i<chains.size()-1; i++) {
                chains.get(i).next(chains.get(i+1));
            }
            DispenseCurrency dispenseCurrency = new DispenseCurrency();
            chains.get(0).process(withdrawAmount, dispenseCurrency);
            AccountOperationsImpl.getInstance().withdraw(dispenseCurrency.getSum());
            System.out.println("Available balance: " + AccountOperationsImpl.getInstance().checkBalance());
            System.out.println("ATM cash: " + ATMCash.getInstance().toString());
        } else {
            System.out.println("Please enter valid amount.");
        }
    }

    /**
     * Display the available balance in the Customer Account
     */
    public void processBalanceInfo() {
        System.out.println("Available balance:"+ AccountOperationsImpl.getInstance().checkBalance());
    }
}
