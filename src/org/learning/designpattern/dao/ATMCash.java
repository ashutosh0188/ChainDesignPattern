package org.learning.designpattern.dao;

/**
 * {@link ATMCash } holds the cash availability inside the ATM Machine at any given point.
 * Along with this data it holds all the currency counts of each type.
 * In real time scenario this class can be a DAO layer to get data from DB. Since DB is common
 * for each request at any given point. So to get this functionality, This class has been designed
 * as Singleton.
 * @author Ashutosh Srivastava
 */
public class ATMCash {
    private int currency100;
    private int currency200;
    private int currency500;
    private int currency1000;
    private int currency2000;

    private static ATMCash atmCash;

    private ATMCash() {}

    public static ATMCash getInstance() {
        if(atmCash == null) {
            atmCash = new ATMCash();
            initializeCurrencyAndCash();
        }
        return atmCash;
    }

    private static void initializeCurrencyAndCash() {
        atmCash.setCurrency100(50);
        atmCash.setCurrency200(50);
        atmCash.setCurrency500(50);
        atmCash.setCurrency1000(50);
        atmCash.setCurrency2000(50);
    }

    public int getCurrency100() {
        return currency100;
    }

    public void setCurrency100(int currency100) {
        this.currency100 = currency100;
    }

    public int getCurrency200() {
        return currency200;
    }

    public void setCurrency200(int currency200) {
        this.currency200 = currency200;
    }

    public int getCurrency500() {
        return currency500;
    }

    public void setCurrency500(int currency500) {
        this.currency500 = currency500;
    }

    public int getCurrency1000() {
        return currency1000;
    }

    public void setCurrency1000(int currency1000) {
        this.currency1000 = currency1000;
    }

    public int getCurrency2000() {
        return currency2000;
    }

    public void setCurrency2000(int currency2000) {
        this.currency2000 = currency2000;
    }

    public int getAvailableCash() {
        ATMCash atmCash = ATMCash.getInstance();
        return atmCash.currency100*100 + atmCash.currency200*200 + atmCash.currency500*500 + atmCash.currency1000*1000 + atmCash.currency2000*2000;
    }

    @Override
    public String toString() {
        return "ATMCash{" +
                "currency100=" + currency100 +
                ", currency200=" + currency200 +
                ", currency500=" + currency500 +
                ", currency1000=" + currency1000 +
                ", currency2000=" + currency2000 +
                '}';
    }
}
