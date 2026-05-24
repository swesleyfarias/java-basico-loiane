package oop_exercises.attributes.ex05;

public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount person1 = new BankAccount();
        person1.accountNumber = 129;
        person1.balance = 1230.99;
        person1.isSpecial = true;
        person1.limit = 3000;
    }
}