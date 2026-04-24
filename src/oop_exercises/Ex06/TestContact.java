package oop_exercises.Ex06;

public class TestContact {
    public static void main(String[] args) {
        Contact contact1 = new Contact();
        contact1.name = "Lilly";
        contact1.address = "99, Beach";
        contact1.email = "ly@email.com";

        contact1.phoneNumbers = new String[3];
        contact1.phoneNumbers[0] = "99995-4555";
        contact1.phoneNumbers[1] = "99995-4554";
        contact1.phoneNumbers[2] = "99995-4551";
    }
}