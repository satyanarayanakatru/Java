package Constructors;

public class BankAccount {

    String accountHolder;
    int balance;

    BankAccount(String name, int bal) {
        this.accountHolder = name;
        this.balance = bal;
    }

    public static void main(String[] args) {

        BankAccount bankAccount1 = new BankAccount("nani", 2344);

        System.out.println(bankAccount1.accountHolder);
        System.out.println(bankAccount1.balance);
    }
}