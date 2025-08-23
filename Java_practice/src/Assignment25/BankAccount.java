package Assignment25;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private final String accountNumber;
    private final String accountHolder;
    private double balance;
    private final List<Transaction> transactionHistory;

    private static class Transaction {
        private final double amount;
        private final String type;
        private final double newBalance;

        Transaction(double amount, String type, double newBalance) {
            this.amount = amount;
            this.type = type;
            this.newBalance = newBalance;
        }
    }

    public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber != null ? accountNumber : "";
        this.accountHolder = accountHolder != null ? accountHolder : "";
        this.balance = initialBalance >= 0 ? initialBalance : 0;
        this.transactionHistory = new ArrayList<>();
    }

    public boolean deposit(double amount) {
        if (amount <= 0) return false;
        balance += amount;
        transactionHistory.add(new Transaction(amount, "DEPOSIT", balance));
        return true;
    }

    public boolean withdraw(double amount) {
        if (amount <= 0 || amount > balance) return false;
        balance -= amount;
        transactionHistory.add(new Transaction(amount, "WITHDRAW", balance));
        return true;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public String getLastTransaction() {
        if (transactionHistory.isEmpty()) return "No transactions";
        Transaction last = transactionHistory.get(transactionHistory.size() - 1);
        return last.type + ": " + last.amount + ", New Balance: " + last.newBalance;
    }

    @Override
    public String toString() {
        String maskedAccount = accountNumber.length() > 4 
            ? "****" + accountNumber.substring(accountNumber.length() - 4)
            : accountNumber;
        return "Account: " + maskedAccount + ", Holder: " + accountHolder + ", Balance: " + balance;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("1234567890", "John Doe", 1000.0);
        System.out.println("Initial Account: " + account);
        account.deposit(500.0);
        System.out.println("After deposit: " + account.getBalance());
        System.out.println("Last transaction: " + account.getLastTransaction());
        account.withdraw(200.0);
        System.out.println("After withdrawal: " + account.getBalance());
        System.out.println("Last transaction: " + account.getLastTransaction());
        account.withdraw(2000.0); // Invalid withdrawal
        System.out.println("After invalid withdrawal: " + account.getBalance());
    }
}