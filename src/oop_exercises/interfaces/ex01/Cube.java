package oop_exercises.interfaces.ex01;

public class Cube extends Shape3D implements SurfaceDimension, VolumetricDimension {
    
    private double edge;

    public Cube(String name, String color, double edge) {
        super(name, color);
        this.edge = edge;
    }

    public double getEdge() {    
        return edge;
    }
    
    public void setEdge(double edge) {
        this.edge = edge;
    }
        
    @Override
    public double calculateArea() {
        return 6.0 * (edge * edge);
    }

    @Override
    public double calculateVolume() {
        return edge * edge * edge;
    }
}    
