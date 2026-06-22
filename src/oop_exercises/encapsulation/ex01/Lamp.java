package oop_exercises.encapsulation.ex01;

public class Lamp {
    private boolean isOn;

    public void turnOn() {
        this.isOn = true;
    }

    public void turnOff() {
        this.isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }

    public Lamp() {
    }

    public void showLamp() {
        if (isOn) {
            System.out.println("The lamp is on.");
        } else {
            System.out.println("The lamp is off.");
        }
    }
}