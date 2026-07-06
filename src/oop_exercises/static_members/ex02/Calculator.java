//Note: exercise 03 was to add a factorial method to this class.
package oop_exercises.static_members.ex02;

public class Calculator {

    public static double sum(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double power(double num1, double num2) {
        return Math.pow(num1, num2);
    }

    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Indeterminacy.");
            return 0;
        }
        return num1 / num2;
    }

    public static int factorial(int num) {
        int total = 1;
        for (int i = 1; i <= num; i++) {
            total *= i;
        }
        return total;
    }
}