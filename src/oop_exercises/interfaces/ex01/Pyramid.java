package oop_exercises.interfaces.ex01;

public class Pyramid extends Shape3D implements SurfaceDimension, VolumetricDimension {
    
    private double baseEdge;
    private double height;
    private double slantHeight;

    public Pyramid(String name, String color, double baseEdge, double height, double slantHeight) {
        super(name, color);
        this.baseEdge = baseEdge;
        this.height = height;
        this.slantHeight = slantHeight;
    }

    public double getBaseEdge() {    
        return baseEdge;
    }
    
    public void setBaseEdge(double baseEdge) {    
        this.baseEdge = baseEdge;
    }

    public double getHeight() {    
        return height;
    }

    public void setHeight(double height) {    
        this.height = height;
    }

    public double getSlantHeight() {
        return slantHeight;
    }

    public void setSlantHeight(double slantHeight) {    
        this.slantHeight = slantHeight;
    }
    
    @Override
    public double calculateArea() {
        return (baseEdge * baseEdge) + (2.0 * baseEdge * slantHeight);
    }

    @Override
    public double calculateVolume() {
        return ((baseEdge * baseEdge) * height) / 3.0;
    }
}
