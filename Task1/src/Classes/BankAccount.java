package Classes;

public class BankAccount {

    String accountHolderName;
    double balance;

    public static void main(String[] args){
        BankAccount accountHolder = new BankAccount();

        accountHolder.accountHolderName = "Satya";
        accountHolder.balance = 443.23;

        System.out.println(accountHolder.accountHolderName);
        System.out.println(accountHolder.balance);
    }
}
