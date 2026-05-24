package oop_exercises.methods.ex01;
public class Lamp {
    boolean isOn;

    void turnOn() {
        isOn = true;
    }

    void turnOff() {
        isOn = false;
    }

    void showLamp() {
        if (isOn) {
            System.out.println("The lamp is on.");
        } else {
            System.out.println("The lamp is off.");
        }
    }
}