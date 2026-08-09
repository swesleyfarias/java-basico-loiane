package oop_exercises.interfaces.ex01;

public class Circle extends Shape2D implements SurfaceDimension {

    private double radius;

    public Circle(String name, String color, double radius) {
        super(name, color);
        this.radius = radius;
    } 

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {    
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * (radius*radius);
    }
}    
