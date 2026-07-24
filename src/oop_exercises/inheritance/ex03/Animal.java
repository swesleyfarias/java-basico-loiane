package oop_exercises.inheritance.ex03;

public class Animal {
    
    private String name;
    private int length;
    private int paws;
    private String color;
    private String environment;
    private double speed;

    public Animal() {
        this.paws = 4; 
    }

    public Animal(String name, int length, String color, String environment, double speed) {
        this();
        this.name = name;
        this.length = length;
        this.color = color;
        this.environment = environment;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getPaws() {
        return paws;
    }

    public void setPaws(int paws) {
        this.paws = paws;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        String s = "------------------";
        s += "\nAnimal: " + name;
        s += "\nLength: " + length + "cm";
        s += "\nPaws: " + paws;
        s += "\nColor: " + color;
        s += "\nEnvironment: " + environment;
        s += "\nSpeed: " + speed + "m/s";
        return s;
    }
}
