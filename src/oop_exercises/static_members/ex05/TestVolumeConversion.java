package oop_exercises.static_members.ex05;

public class TestVolumeConversion {
    public static void main(String[] args) {
        
        System.out.println(VolumeConversion.litersToCubicCentimeters(10));

        System.out.println(VolumeConversion.cubicMetersToLiters(5));

        System.out.println(VolumeConversion.cubicMetersToCubicFeet(11));

        System.out.println(VolumeConversion.usGallonsToCubicInches(3));
        
        System.out.println(VolumeConversion.usGallonsToLiters(5));
    }
}