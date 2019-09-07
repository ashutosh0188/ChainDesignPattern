package org.learning.designpattern;

import org.learning.designpattern.service.ATMService;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("************ATM Cash Dispenser Machine*************");
        Scanner scanner = new Scanner(System.in);
        boolean status = true;
        while (status) {
            System.out.println("Deposit: 1");
            System.out.println("Withdraw: 2");
            System.out.println("Check Balance: 3");
            System.out.println("Exit: Please press any key.");
            System.out.println("Please enter your options:");
            int i = 0;
            if(scanner.hasNextInt()) {
                i = scanner.nextInt();
            }
            switch (i) {
                case 1:
                    ATMService.getInstance().processDeposit();
                    System.out.println("*****************************");
                    break;
                case 2:
                    System.out.println("*****************************");
                    break;
                case 3:
                    ATMService.getInstance().processBalanceInfo();
                    System.out.println("*****************************");
                    break;
                default:
                    System.out.println("Thanks for visiting.");
                    status = false;
                    break;
            }
        }
    }
}
