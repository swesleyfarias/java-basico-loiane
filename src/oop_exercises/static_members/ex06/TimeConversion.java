package oop_exercises.static_members.ex06;

public class TimeConversion {

    public static double minutesToSeconds(double minutes) {
        return minutes * 60;
    }

    public static double hoursToMinutes(double hours) {
        return hours * 60;
    }

    public static double daysToHours(double days) {
        return days * 24;
    }

    public static double weeksToDays(double weeks) {
        return weeks * 7;
    }

    public static double monthsToDays(double months) {
        return months * 30;
    }

    public static double yearsToDays(double years) {
        return years * 365.25;
    }
}