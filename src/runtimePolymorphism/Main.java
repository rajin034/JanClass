package runtimePolymorphism;

public class Main {
    public static void main(String[] args) {
        Account account =new Account();
        account.withdraw(200);
        account = new SavingsAccount();
        System.out.println();
        account.deposit(1000);
        System.out.println("Savings account balance: " + account.balance);
        account.withdraw(500);
        System.out.println("Savings account balance: " + account.balance);
        System.out.println();

        account = new CheckingAccount();
        account.deposit(1000);
        System.out.println("Current account balance: " + account.balance);
        account.withdraw(500);
        System.out.println("Current account balance: " + account.balance);
    }
}
