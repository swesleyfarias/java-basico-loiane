package oop_exercises.inheritance.ex01;

import java.time.LocalDate;

public class SavingsAccount extends BankAccount {

    private int earningDay;

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(String customerName, String accountNumber, double balance, int earningDay) {
        super(customerName, accountNumber, balance);
        this.earningDay = earningDay;
    }

    public int getEarningDay() {
        return earningDay;
    }

    public void setEarningDay(int earningDay) {
        this.earningDay = earningDay;
    }

    public double getYield(double interestRate) {
        return this.getBalance() * (interestRate / 100);
    }

    public boolean canCalculateNewBalance(double interestRate) {
        return LocalDate.now().getDayOfMonth() == earningDay;
    }

    public boolean calculateNewBalance(double interestRate) {

        if (interestRate < 0.0) {
            return false;
        }
        if (!canCalculateNewBalance(interestRate)) {
            return false;
        }

        return this.deposit(getYield(interestRate));
    }

    @Override
    public String toString() {
        return super.toString() + "\nEarning Day: " + earningDay;
    }
}