package encaptulationExamples;


/*import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;*/


import java.io.File;
import java.io.IOException;

public class BankAccount {
    // private fields
    private int accountNumber;
    private double balance;
    private String accountHolder;

    // public methods
    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String getAccountHolder() {
        return accountHolder;
    }
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                ", accountHolder='" + accountHolder + '\'' +
                '}';
    }
}
class main{
    public static void main(String[] args) throws Exception{
        /*ObjectMapper mapper = new ObjectMapper();
        BankAccount account = mapper.readValue(new File("C:\\Users\\rajpa\\OneDrive\\Desktop\\JanClassCsit\\src\\encaptulationExamples\\account.json"), BankAccount.class);
        System.out.println(account.toString());
        System.out.println(account.getAccountHolder());*/

    }
}
