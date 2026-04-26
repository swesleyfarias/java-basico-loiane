

public class TestBook {
    public static void main(String[] args) {
        Book book = new Book();
        book.title = "What's it like to be alone?";
        book.author = "Unknown";
        book.pages = 390;

        System.out.println("Title: " + book.title);
        System.out.println("Author: " + book.author);
        System.out.println("Pages: " + book.pages);
    }
}
