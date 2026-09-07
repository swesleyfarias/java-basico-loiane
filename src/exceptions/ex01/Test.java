package exceptions.ex01;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();
        String name, phone;
        int option;
        boolean running = true;

        while(running) {
            try {
                menu();
                option = sc.nextInt();
                sc.nextLine();

                switch(option) {
                    case 1:
                        System.out.print("Enter name to search: ");
                        name = sc.nextLine();
                        
                        Contact foundContact = addressBook.consultContact(name);
                        System.out.println("\nContact found!");
                        System.out.println("-----------");
                        System.out.println(foundContact);
                        break;
                   
                    case 2:
                        System.out.print("Enter name: ");
                        name = sc.nextLine();
                        System.out.print("Enter phone: ");
                        phone = sc.nextLine();

                        Contact newContact = new Contact(name, phone);
                        addressBook.addContact(newContact);
                        System.out.println("\nContact added sucessfully");
                        break;

                    case 3:
                        System.out.println("\nExiting...");
                        running = false;
                        break;

                    default:
                        System.out.println("\nInvalid option! Please try again.");
                        break;
                }  

            } catch (ContactNotFoundException e) {
                System.out.println(e.getMessage());

            } catch (AddressBookFullException e) {
                System.out.println(e.getMessage());

            } catch (InputMismatchException e) {
                System.out.println("\nError: Please enter only numbers in the menu!");
                sc.nextLine();

            }    
        }

        sc.close();
    }
        private static void menu() {
        System.out.println("=== MAIN MENU ===");
        System.out.println("1. Find Contact");
        System.out.println("2. Add Contact");
        System.out.println("3. Exit");
        System.out.print("\nChoose an option: ");
    }    
}
