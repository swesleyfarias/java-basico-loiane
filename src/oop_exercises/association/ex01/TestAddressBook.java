package oop_exercises.association.ex01;

import java.util.Scanner;

public class TestAddressBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String addressBookName, name, phone, email;

        System.out.println("Enter the address book name: ");
        addressBookName = sc.nextLine();

        AddressBook addressBook = new AddressBook(addressBookName);

        System.out.println("Register 3 contacts:");
        Contact[] contacts = new Contact[3];

        for (int i = 0; i < contacts.length; i++) {

            System.out.printf("%nContact %d: %n", (i + 1));
            System.out.println("Name:  ");
            name = sc.nextLine();

            System.out.println("Phone: ");
            phone = sc.nextLine();

            System.out.println("Email: ");
            email = sc.nextLine();

            Contact contact = new Contact(name, phone, email);
            contacts[i] = contact;
        }

        addressBook.setContacts(contacts);

        if (addressBook != null) {
            System.out.println(addressBook.getAddressBookInfo());
        }

        sc.close();
    }
}