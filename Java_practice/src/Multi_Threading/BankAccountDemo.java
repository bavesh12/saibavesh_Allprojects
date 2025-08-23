package Multi_Threading;

class BankAccount {
    int balance = 500;

    synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited " + amount + ", balance: " + balance);
    }

    synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;  // Fixed the -= operator (was =- in original)
            System.out.println("Withdrawn " + amount + ", balance: " + balance);
        } else {
            System.out.println("Insufficient amount");
        }
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        
        // Create deposit thread
        Thread depositThread = new Thread(() -> account.deposit(500));
        
        // Create withdrawal thread
        Thread withdrawThread = new Thread(() -> account.withdraw(200));
        
        // Start both threads
        depositThread.start();
        withdrawThread.start();
    }
}