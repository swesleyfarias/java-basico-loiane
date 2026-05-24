package oop_exercises.methods.ex02;
public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount person1 = new BankAccount();
        person1.number = 12531;
        person1.balance = 2000;
        person1.limit = 3000;
        person1.isSpecial = true;

        person1.withdrawal(4000);
        person1.deposit(100);

        person1.showBalance();

        if (person1.usingExtraLimit()) {
            System.out.println(person1.number + " using the extra limit.");
        } else {
            System.out.println(person1.number + " is not using the extra limit.");
        }

    }
}