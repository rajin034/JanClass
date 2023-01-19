package runtimePolymorphism;

class CheckingAccount extends Account {
    public void withdraw(double amount) {
        balance -= amount;
    }
}
