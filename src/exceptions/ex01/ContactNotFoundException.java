package exceptions.ex01;

public class ContactNotFoundException extends Exception {

    private String name;

    public ContactNotFoundException(String name) {
        this.name = name;
    }

    @Override
    public String getMessage() {
        return "\nContact: " + name + " not found.";
    }    
}    
