package oop_exercises.encapsulation.ex02;

public class BankAccount {
    private int number;
    private double balance;
    private double limit;
    private boolean isSpecial;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setLimit(double limit) {
        if (isSpecial) {
            this.limit = limit;
        } else {
            this.limit = 0;
        }
    }

    public void setIsSpecial(boolean isSpecial) {
        this.isSpecial = isSpecial;

        if (!isSpecial) {
            limit = 0;
        }
    }

    public void withdrawal(double cash) {
        if (balance + limit >= cash) {
            balance -= cash;
            System.out.println("Withdrawal completed.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void deposit(double cash) {
        balance += cash;
    }

    public boolean usingExtraLimit() {
        return balance < 0;
    }
}