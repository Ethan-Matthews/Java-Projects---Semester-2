package ca.nscc;
//Person superclass. Attributes for names and addresses common to staff and student objects.
public class Person {
    //attributes are set to private.
    private String name;
    private String address;
    //constructor for person.
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
    //getter for names.
    public String getName() {
        return name;
    }
    //getter for addresses.
    public String getAddress() {
        return address;
    }
}
