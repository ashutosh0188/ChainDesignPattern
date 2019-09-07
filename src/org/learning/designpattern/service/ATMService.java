package org.learning.designpattern.service;

import java.util.Scanner;

public class ATMService {
    private static ATMService atmService;
    private ATMService() {}

    public static ATMService getInstance() {
        if(atmService == null) {
            atmService = new ATMService();
        }
        return atmService;
    }

    public void processDeposit() {
        System.out.println("Please enter amount to deposit:");
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()) {
            int x = scanner.nextInt();
            OperationService.getInstance().deposit(x);
            System.out.println("Your money deposited successfully!");
            System.out.println("Available balance: " + OperationService.getInstance().checkBalance());
        }
    }

    public void processWithdraw() {

    }

    public void processBalanceInfo() {
        System.out.println("Available balance:"+OperationService.getInstance().checkBalance());
    }
}
