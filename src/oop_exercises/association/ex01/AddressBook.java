package oop_exercises.association.ex01;

public class AddressBook {

    private String name;
    private Contact[] contacts;

    AddressBook(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setContacts(Contact[] contacts) {
        this.contacts = contacts;
    }

    public String getAddressBookInfo() {

        if (contacts != null) {
            String info = "\n" + getName() + "\n";

            for (Contact i : this.contacts) {
                if (i != null) {
                    info += i.getContactInfo();
                }
            }
            return info;
        }
        return "Empty address book or no contacts registered.";
    }

}