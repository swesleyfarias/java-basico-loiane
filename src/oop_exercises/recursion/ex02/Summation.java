package oop_exercises.recursion.ex02;

public class Summation {

    public static int calculateSum(int n) {

        if (n == 1) {
            return 1;
        }

        return n + calculateSum(n - 1);
    }
}