package oop_exercises.inheritance.ex01;

public class BankAccount {

    private String customerName;
    private String accountNumber;
    private double balance;

    public BankAccount() {

    }

    public BankAccount(String customerName, String accountNumber, double balance) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean canWithdraw(double amount) {
        return balance >= amount && amount > 0;
    }

    public boolean withdraw(double amount) {

        if (!canWithdraw(amount)) {
            return false;
        }

        setBalance(getBalance() - amount);
        return true;
    }

    public boolean canDeposit(double amount) {
        return amount > 0;
    }

    public boolean deposit(double amount) {
        if (!canDeposit(amount)) {
            return false;
        }

        setBalance(getBalance() + amount);
        return true;
    }

    @Override
    public String toString() {
        String s = "Customer's Name: " + customerName;
        s += "\nAccount number: " + accountNumber;
        s += "\nBalance: " + balance;
        return s;
    }
}