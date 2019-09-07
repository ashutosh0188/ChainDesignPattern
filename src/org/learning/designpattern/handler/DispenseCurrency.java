package org.learning.designpattern.handler;

/**
 * This class holds all the currency counts for withdraw amount at anytime.
 * This is just useful to show information about currency counts of total withdraw amount to the user.
 */
public class DispenseCurrency {
    private int currency100;
    private int currency200;
    private int currency500;
    private int currency1000;
    private int currency2000;

    public DispenseCurrency() {}


    void setCurrency100(int currency100) {
        this.currency100 = currency100;
    }

    void setCurrency200(int currency200) {
        this.currency200 = currency200;
    }

    void setCurrency500(int currency500) {
        this.currency500 = currency500;
    }

    void setCurrency1000(int currency1000) {
        this.currency1000 = currency1000;
    }

    void setCurrency2000(int currency2000) {
        this.currency2000 = currency2000;
    }

    public int getSum() {
        return currency100*100 + currency200*200 + currency500*500 + currency1000*1000 + currency2000*2000;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("-----------------------\n");
        if(currency2000>0) {
            sb.append("2000*" + currency2000 + "=" + currency2000*2000);
            sb.append("\n");
        }
        if(currency1000>0) {
            sb.append("1000*" + currency1000 + "=" + currency1000*1000);
            sb.append("\n");
        }
        if(currency500>0) {
            sb.append("500*" + currency500 + "=" + currency500*500);
            sb.append("\n");
        }
        if(currency200>0) {
            sb.append("200*" + currency200 + "=" + currency200*200);
            sb.append("\n");
        }
        if(currency100>0) {
            sb.append("100*" + currency100 + "=" + currency100*100);
            sb.append("\n");
        }
        sb.append("-----------------------\n");
        sb.append("TOTAL="+getSum());
        return sb.toString();
    }
}
