package fintech.model;

/**
 * @author 12S23006 - Cardolan Sinaga
 * @author 12S23051 - Theresia Silaban
 */
public class Account {
    private String nama;
    private String namaAkun;
    private double balance;

    public Account(String nama, String namaAkun) {
        this.nama = nama;
        this.namaAkun = namaAkun;
        this.balance = 0.0;
    }

    public String getNama() {
        return nama;
    }

    public String getNamaAkun() {
        return namaAkun;
    }

    public double getBalance() {
        return balance;
    }

    public void updateBalance(double amount) {
        this.balance += amount;
    }

    @Override
    public String toString() {
        return namaAkun + "|" + nama + "|" + balance;
    }
}