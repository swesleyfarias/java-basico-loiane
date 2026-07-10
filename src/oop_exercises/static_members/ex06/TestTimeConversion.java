package oop_exercises.static_members.ex06;

public class TestTimeConversion {
    public static void main(String[] args) {

        System.out.println(TimeConversion.minutesToSeconds(45));

        System.out.println(TimeConversion.hoursToMinutes(2));

        System.out.println(TimeConversion.daysToHours(7));

        System.out.println(TimeConversion.weeksToDays(3));

        System.out.println(TimeConversion.monthsToDays(2));

        System.out.println(TimeConversion.yearsToDays(17));
    }
}