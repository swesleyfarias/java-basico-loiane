package exceptions.ex01;

public class AddressBookFullException extends Exception {

    @Override
    public String getMessage() {
        return "\nThe address book is full.";
    }    
}    
