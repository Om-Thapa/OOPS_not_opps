// package OPPS.Thread;

// Account class with synchronized methods
class Account {
    private double balance;

    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    // Synchronized deposit method
    public synchronized void deposit(double amount) {
        System.out.println(Thread.currentThread().getName() + " is depositing: $" + amount);
        double temp = balance;
        try {
            Thread.sleep(100);  // Simulate processing time
        } catch (InterruptedException e) {
            System.out.println("Interrupted during deposit");
        }
        temp += amount;
        balance = temp;
        System.out.println(Thread.currentThread().getName() + " deposited. New balance: $" + balance);
    }

    // Synchronized withdraw method
    public synchronized void withdraw(double amount) {
        System.out.println(Thread.currentThread().getName() + " is withdrawing: $" + amount);
        if (balance >= amount) {
            double temp = balance;
            try {
                Thread.sleep(100);  // Simulate processing time
            } catch (InterruptedException e) {
                System.out.println("Interrupted during withdrawal");
            }
            temp -= amount;
            balance = temp;
            System.out.println(Thread.currentThread().getName() + " withdrew. New balance: $" + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " could not withdraw. Insufficient balance!");
        }
    }

    public synchronized double getBalance() {
        return balance;
    }
}

// Thread class for deposit operations
class DepositThread extends Thread {
    private Account account;
    private double amount;

    public DepositThread(Account account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            account.deposit(amount);
        }
    }
}

// Thread class for withdrawal operations
class WithdrawThread extends Thread {
    private Account account;
    private double amount;

    public WithdrawThread(Account account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    public void run() {
        for (int i = 0; i < 2; i++) {
            account.withdraw(amount);
        }
    }
}

// Main class to demonstrate thread synchronization
public class Accounts {
    public static void main(String[] args) {
        // Create Account with initial balance
        Account account = new Account(1000);
        System.out.println("Initial Account Balance: $" + account.getBalance());
        System.out.println("==============================================\n");

        // Create multiple thread objects that share the same Account
        DepositThread deposit1 = new DepositThread(account, 200);
        WithdrawThread withdraw1 = new WithdrawThread(account, 50);

        // Set names for threads
        deposit1.setName("Deposit-Thread-1");
        withdraw1.setName("Withdraw-Thread-1");

        // Start all threads
        deposit1.start();
        withdraw1.start();

        // Main thread waits for all transactions to finish using join()
        try {
            deposit1.join();
            withdraw1.join();
            System.out.println("\n==============================================");
            System.out.println("All transactions completed!");
            System.out.println("Final Account Balance: $" + account.getBalance());
            System.out.println("==============================================");
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
    }
}
