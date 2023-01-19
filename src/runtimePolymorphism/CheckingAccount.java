package runtimePolymorphism;

class CheckingAccount extends Account {
    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }
}
