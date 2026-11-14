package OOPS.Encapsulation;

public class BankAccount {
    private long accountNumber;
    private int balance;


    public BankAccount(long accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("Current Balance: " + balance);
    }

    public void withdraw(int amount) {
        if (balance >= amount && amount > 0) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Current Balance: " + balance);
        } else {
            System.out.println("insufficient funds");
        }
    }


}
