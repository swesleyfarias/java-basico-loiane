package oop_exercises.interfaces.ex01;

public class Triangle extends Shape2D implements SurfaceDimension {
 
    private double base;
    private double height; 

    public Triangle(String name, String color, double base, double height) {
        super(name, color);
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {    
        this.base = base;
    }

    public double getHeight() {    
        return height;
    }

    public void setHeight(double height) {    
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (base * height) /2.0;
    }
}    
