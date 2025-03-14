package fintech.driver;

import fintech.model.Account;
import fintech.model.Transaction;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;



/**
 * @author 12S23006 - Cardolan Sinaga
 * @author 12S23051 - Theresia Silaban
 */
public class Driver1 {
    private static Map<String, Account> accounts = new HashMap<>();
    private static int transactionCounter = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Account> Accounts = new ArrayList<>();
        List<Transaction> Transactions = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("---")) {
                break;
            }

            String[] segments = input.split("#");
            if (segments.length > 0) {
                String command = segments[0];
                switch (command) {
                    case "create-account":
                        if ("create-account".equals(command)) {
                            String nama = scanner.nextLine();
                            String namaAkun = scanner.nextLine();

                            Account account = new Account(nama, namaAkun);
                            System.out.println(account);
                 } else {
                            System.out.println("Invalid command");
                    }
                        break;
                
                    case "create-transaction":
                        if ("create-transaction".equals(command)) {
                            String namaAkun = scanner.nextLine();
                            double amount = Double.parseDouble(scanner.nextLine());
                            String tipe = scanner.nextLine();
                            String postedAt = scanner.nextLine();
                            String note = scanner.nextLine();

                            Account account = accounts.get(namaAkun);
                        if (account != null) {
                            transactionCounter++;
                            Transaction transaction = new Transaction(namaAkun, amount, postedAt, note);
                            account.updateBalance(amount);
                            System.out.println(transactionCounter + "|" + transaction + "|" + account.getBalance());
                        } else {
                            System.out.println("Account not found");
                        }
                        } else {
                        System.out.println("Invalid command");
                        }
                        break;
                }
            }

        for (Account Account : Accounts) {
            System.out.println(Account.getNama() + "|" + Account.getNamaAkun() + "|" + Account.getBalance());
        }

        for (Transaction Transaction : Transactions) {
            System.out.println(Transaction.getAccountName() + "|" + Transaction.getPostedAt() + "|" + Transaction.getTipe() + "|" + Transaction.getAmount() + "|" + Transaction.getNote());
        }

        scanner.close();
    }
        }
    }