package oop_exercises.interfaces.ex01;

public class Test {
    public static void main(String[] args) {
        GeometricShape[] geometricShapes = { 
            new Circle("Main Circle", "Red", 5.0),
            new Square("Box", "Blue", 4.0),
            new Triangle("Roof", "Green", 6.0, 4.0),
            new Cube("Ice Cube", "White", 3.0),
            new Cylinder("Soda Can", "Silver", 2.0, 5.0),
            new Pyramid("Pharaoh", "Gold", 4.0, 3.0, 3.61)
        };

        for (GeometricShape n : geometricShapes) {        

            System.out.println(n.toString());

            if (n instanceof SurfaceDimension) {
               
                SurfaceDimension sd  = (SurfaceDimension) n;
                System.out.printf("Area: %.2fm² %n", sd.calculateArea());
            }

            if (n instanceof VolumetricDimension) {

                VolumetricDimension vd = (VolumetricDimension) n;
                System.out.printf("Volume: %.2fm³ %n", vd.calculateVolume());
            }

            System.out.println("------------");
        }    
    }    
}    
