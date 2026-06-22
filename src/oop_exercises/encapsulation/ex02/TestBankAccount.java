package oop_exercises.encapsulation.ex02;

public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount person1 = new BankAccount();

        person1.setIsSpecial(false);
        person1.setNumber(456);
        person1.setBalance(50);
        person1.setLimit(10000);
        person1.withdrawal(60);

        System.out.printf("Balance: R$%.2f %n", person1.getBalance());
        if (person1.usingExtraLimit()) {
            System.out.println(person1.getNumber() + " using the extra limit.");
        } else {
            System.out.println(person1.getNumber() + " is not using the extra limit.");
        }

    }
}