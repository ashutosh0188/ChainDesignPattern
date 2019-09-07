package org.learning.designpattern.handler;

import org.learning.designpattern.dao.ATMCash;

/**
 * A class that perform counting currency of 2000.
 * @author Ashutosh Srivastava
 */
public class CurrencyHandler2000 implements Chain {
    private Chain chain;

    /**
     * This method checks how much max currency if 2000 can be dispensed to withdraw cash.
     * If amount still remains to withdraw, then it forwards request to next handler. And update the
     * {@link DispenseCurrency} and {@link ATMCash}
     * Otherwise, will display the dispensed amount and terminate the chain flow.
     *
     * @param amount the amount needs to withdraw
     * @param dispenseCurrency info of different types of currency, that is part of withdraw amount as multiple of currencies.
     */
    @Override
    public void process(int amount, DispenseCurrency dispenseCurrency) {
        int requiredCurrency  = amount/2000;
        int availableCurrency = ATMCash.getInstance().getCurrency2000();
        int remainingAmount;
        int actualCurrencyDispensed;
        int remainingCurrency;
        if(availableCurrency >= requiredCurrency) {
            actualCurrencyDispensed = requiredCurrency;
            remainingCurrency = availableCurrency - actualCurrencyDispensed;
        } else {
            actualCurrencyDispensed = availableCurrency;
            remainingCurrency = 0;
        }
        dispenseCurrency.setCurrency2000(actualCurrencyDispensed);
        ATMCash.getInstance().setCurrency2000(remainingCurrency);
        remainingAmount = amount - (actualCurrencyDispensed*2000);
        //System.out.println("Remaining Amount:"+remainingAmount+"Till now:"+ dispenseCurrency.toString());
        if(remainingAmount>0 && this.chain!=null) {
            this.chain.process(remainingAmount, dispenseCurrency);
        } else {
            System.out.println(dispenseCurrency.toString());
        }
    }

    @Override
    public void next(Chain chain) {
        this.chain = chain;
    }
}
