package oop_exercises.static_members.ex03;

class AreaConversion {
    public static double squareMetersToSquareFeet(double squareMeters) {
        return squareMeters*10.76;
    }

    public static double squareFeetToSquareCentimeters(double squareFeet) {
        return squareFeet*929;
    }

    public static double squareMilesToAcres(double squareMiles) {
        return squareMiles*640;
    }

    public static double acreToSquareFeet(double acre) {
        return acre*43560;
    }
}