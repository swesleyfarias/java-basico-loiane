package exceptions.ex01;

public class Contact {

    private String name;
    private String phone;
    private int id;
    private static int cont = 0;

    Contact(String name, String phone) {

        this.name = name;
        this.phone = phone;
        cont++;
        this.id = cont;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return name + " ID: " + id + "\n" + phone;
    }    
}
