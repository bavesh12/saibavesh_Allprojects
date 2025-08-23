package Encapsulation;

public class BankAccount {
    private double balance = 0;

    // Deposit money
    public void deposit(double amt) {
        if (amt > 0) {
            balance += amt;
            System.out.println("Deposited = " + amt);
        }
    }

    // Withdraw money
    public void withdraw(double amt) {
        if (amt > 0 && amt <= balance) {
            balance -= amt;
            String stars = "*".repeat(String.valueOf((double)amt).length());
            System.out.println("Withdraw amount = " + stars);       
            } else
            {
            System.out.println("Invalid amount");
            }
        }

    // Get current balance
    public double getBalance() {
        return balance;
    }

    // Main method to test the class
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.deposit(500000);
        acc.withdraw(3000);
        System.out.println("Current balance is " + acc.getBalance());
    }
}
