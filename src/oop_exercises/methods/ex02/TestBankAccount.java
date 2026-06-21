package oop_exercises.methods.ex02;

public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount person1 = new BankAccount();

        person1.isSpecial = false;
        person1.number = 4561;
        person1.balance = 50;
        person1.limit(10000);
        person1.withdrawal(60);

        person1.showBalance();

        if (person1.usingExtraLimit()) {
            System.out.println(person1.number + " using the extra limit.");
        } else {
            System.out.println(person1.number + " is not using the extra limit.");
        }

    }
}