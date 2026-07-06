package oop_exercises.static_members.ex01;

public class Counter {
    private static int counterValue;

    public Counter() {
        counterValue++;
    }

    public static int getCounterValue() {
        return counterValue;
    }

    public static void resetCounter() {
        counterValue = 0;
    }

    public static void incrementCounter() {
        counterValue++;
    }
}