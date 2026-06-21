package oop_exercises.methods.ex02;

public class BankAccount {
    int number;
    double balance;
    double limit;
    boolean isSpecial;

    void limit(double limit_) {
        if (isSpecial) {
            limit = limit_;
        } else {
            limit = 0;
        }
    }

    void withdrawal(double cash) {
        if (balance + limit >= cash) {
            balance -= cash;
            System.out.println("Withdrawal completed.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    void deposit(double cash) {
        balance += cash;
    }

    boolean usingExtraLimit() {
        return balance < 0;
    }

    void showBalance() {
        System.out.printf("Balance: %.2f%n", balance);
    }
}