package org.learning.designpattern;

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
            System.out.println("Exit: any key");
            System.out.println("Please enter your options:");
            int i = 0;
            if(scanner.hasNextInt()) {
                i = scanner.nextInt();
            }
            switch (i) {
                case 3:
                    break;
                case 2:
                    break;
                case 1:
                    break;
                default:
                    System.out.println("Thanks for visiting.");
                    status = false;
                    break;
            }
        }
    }
}
