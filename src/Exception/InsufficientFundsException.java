package Exception;

public class InsufficientFundsException extends Exception {
    
    public InsufficientFundsException(String message) {
        super(message);
    }
    
}

class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Not enough funds to withdraw " + amount);
        }
        balance -= amount;
        System.out.println("Withdrawal successful. New balance: " + balance);
    }

}

class Example {
    
    public static void main(String[] args) {
        BankAccount account = new BankAccount(100.00);
        try {
            account.withdraw(50.00);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
    
}
