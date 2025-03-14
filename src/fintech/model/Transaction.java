package fintech.model;

/**
 * 12S23006 - Cardolan Sinaga
 * 12S23051 - Theresia Silaban
 */
public class Transaction {
    private String accountName;
    private String postedAt;
    private String tipe;
    private double amount;
    private String note;

    public Transaction(String accountName, double amount, String postedAt, String note) {
        this.accountName = accountName;
        this.amount = amount;
        this.postedAt = postedAt;
        this.note = note;
        this.tipe = "Transaction";
    }

    public String getAccountName() {
        return accountName;
    }

    public String getPostedAt() {
        return postedAt;
    }

    public String getTipe() {
        return tipe;
    }

    public double getAmount() {
        return amount;
    }

    public String getNote() {
        return note;
    }

    @Override
    public String toString() {
        return accountName + "|" + amount + "|" + postedAt + "|" + note;
    }
}