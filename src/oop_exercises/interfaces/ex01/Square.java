package oop_exercises.interfaces.ex01;

public class Square extends Shape2D implements SurfaceDimension {
    
    private double side;

    public Square(String name, String color, double side) {
        super(name, color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {    
        this.side = side;
    }


    @Override
    public double calculateArea() {
        return side * side;
    }
}    
