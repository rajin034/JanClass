package runtimePolymorphism;

public class Account {
    double balance = 500;
    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount){
        System.out.println("Remaining Balance is " + (balance - amount) );
    }

}
