package oop_exercises.inheritance.ex01;

public class SpecialAccount extends BankAccount {

    private double limit;

    public SpecialAccount() {
        super();
    }

    public SpecialAccount(String customerName, String accountNumber, double balance, double limit) {
        super(customerName, accountNumber, balance);
        this.limit = limit;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    @Override
    public boolean canWithdraw(double amount) {
        return (this.getBalance() + limit) >= amount && amount > 0;
    }

    @Override
    public String toString() {
        return super.toString() + "\nLimit: " + getLimit();
    }
}