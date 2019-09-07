package org.learning.designpattern;

import org.learning.designpattern.service.ATMService;

import java.util.Scanner;

/**
 * Main class, A client App that is responsible to interact with customer and letting the user to choose different
 * kinds of available options. It will repeat its different options, until customer decide to exit from it.
 * @author Ashutosh Srivastava
 */
public class App {
    public static void main(String[] args) {
        ATMService atmService = new ATMService();
        Scanner scanner = new Scanner(System.in);
        boolean status = true;
        while (status) {
            System.out.println("************ATM Cash Dispenser Machine*************");
            System.out.println("Deposit: 1");
            System.out.println("Withdraw: 2");
            System.out.println("Check Balance: 3");
            System.out.println("Exit: Please press any key.");
            System.out.println("Please enter your option:");

            int i = 0;
            if(scanner.hasNextInt()) {
                i = scanner.nextInt();
            }

            switch (i) {
                case 1:
                    atmService.processDeposit();
                    System.out.println("*****************************");
                    break;
                case 2:
                    atmService.processWithdraw();
                    System.out.println("*****************************");
                    break;
                case 3:
                    atmService.processBalanceInfo();
                    System.out.println("*****************************");
                    break;
                case 4:
                    System.out.println("Thanks for visiting.");
                    status = false;
                    break;
                default:
                    System.out.println("Please enter valid options between 1 to 4.");
                    status = false;
                    break;
            }
        }
    }
}
