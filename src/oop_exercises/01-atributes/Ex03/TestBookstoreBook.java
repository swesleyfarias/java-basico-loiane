

public class TestBookstoreBook {
    public static void main(String[] args) {
        BookstoreBook book = new BookstoreBook();
        book.title = "Romeu e Julieta";
        book.author = "Wes";
        book.price = 30.09;

        System.out.println("Title: " + book.title);
        System.out.println("Author: " + book.author);
        System.out.println("Price: " + book.price);
    }
}
