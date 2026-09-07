package exceptions.ex01;

public class AddressBook {

    Contact[] contact = new Contact[5];
    private int index = 0;

    public void addContact(Contact c) throws AddressBookFullException {
        if (index >= contact.length) {
            throw new AddressBookFullException();
        }

        contact[index] = c;
        index++;
    }    

    public Contact consultContact(String name) throws ContactNotFoundException {
        for (Contact c : contact) {
            if (c != null && c.getName().equals(name)) {
                return c;
            }
        }

        throw new ContactNotFoundException(name);
    }    
}    
