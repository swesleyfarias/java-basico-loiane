package oop_exercises.attributes.ex04;

public class TestLibraryBook {
    public static void main(String[] args) {
        LibraryBook book = new LibraryBook();
        book.title = "The love";
        book.author = "Lilly";
        book.year = 2025;

        System.out.println("Title: " + book.title);
        System.out.println("Author: " + book.author);
        System.out.println("Year: " + book.year);
    }
}