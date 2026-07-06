package oop_exercises.static_members.ex01;

public class TestCounter {
    public static void main(String[] args) {
        Counter.incrementCounter();
        Counter.incrementCounter();

        Counter.resetCounter();

        Counter.incrementCounter();

        System.out.println(Counter.getCounterValue());
    }
}