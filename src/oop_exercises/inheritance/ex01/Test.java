package oop_exercises.inheritance.ex01;

public class Test {
    public static void main(String[] args) {

        SavingsAccount savingsAccount = new SavingsAccount("Camilly", "777", 2000, 17);
        SpecialAccount specialAccount = new SpecialAccount("Wesley", "123", 100, 200);

        // Savings Account info
        System.out.println(savingsAccount);
        executeWithdrawal(savingsAccount, 1200);
        executeDeposit(savingsAccount, 100);
        executeWithdrawal(savingsAccount, 1000);
        executeNewBalance(savingsAccount, 0.5);
        System.out.println("\n" + savingsAccount);

        // Special Account info
        System.out.println("\n" + specialAccount);
        executeDeposit(specialAccount, 50);
        executeWithdrawal(specialAccount, 200);
        executeWithdrawal(specialAccount, 50);
        System.out.println("\n" + specialAccount);

    }

    // Static to verify the withdrawal
    private static void executeWithdrawal(BankAccount account, double value) {
        if (account.withdraw(value)) {
            System.out.printf("Withdrawal of %.2f successful! New balance: %.2f %n", value, account.getBalance());
        } else {
            System.out.printf("Withdrawal denied for %.2f: Insufficient funds or limit exceeded. %n");
        }
    }

    // Static to verify the deposit
    private static void executeDeposit(BankAccount account, double value) {
        if (account.deposit(value)) {
            System.out.printf("Deposit of %.2f successful! New balance: %.2f %n", value, account.getBalance());
        } else {
            System.out.printf("Deposit denied for %.2f: Invalid value. %n");
        }
    }

    // Static to verify the day of saving account
    private static void executeNewBalance(SavingsAccount account, double interestRate) {
        if (account.calculateNewBalance(interestRate)) {
            System.out.printf("Applied earning! New balance: %.2f %n", account.getBalance());
        } else {
            System.out.println("Today is not the day for earnings, or the rate is invalid, new balance not calculated.");
        }
    }
}