package oop_exercises.static_members.ex04;

public class VolumeConversion {
    public static double litersToCubicCentimeters(double liters) {
        return liters * 1000;
    }

    public static double cubicMetersToLiters(double cubicMeters) {
        return cubicMeters * 1000;
    }

    public static double cubicMetersToCubicFeet(double cubicMeters) {
        return cubicMeters * 35.32;
    }

    public static double usGallonsToCubicInches(double usGallons) {
        return usGallons * 231;
    }

    public static double usGallonsToLiters(double usGallons) {
        return usGallons * 3.785;
    }
}