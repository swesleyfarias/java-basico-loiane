package oop_exercises.interfaces.ex01;

public class Cylinder extends Shape3D implements SurfaceDimension, VolumetricDimension {
    
    private double radius;
    private double height;

    public Cylinder(String name, String color, double radius, double height) {
        super(name, color);
        this.radius = radius;
        this.height = height;
    }

    public double getRadius() {    
        return radius;
    }

    public void setRadius(double radius) {    
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {    
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 2.0 * Math.PI * radius * (radius + height);
    }

    @Override
    public double calculateVolume() {
        return Math.PI * (radius * radius) * height;
    }
}    
