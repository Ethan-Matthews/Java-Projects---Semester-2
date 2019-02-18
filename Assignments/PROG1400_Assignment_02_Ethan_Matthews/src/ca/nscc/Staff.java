package ca.nscc;
//Staff subclass, uses attributes from person.
public class Staff extends Person {
    //Private Staff attributes.
    private int yearsOfService;
    private double salary;

    //Staff object constructor. Takes name and address from super person class.
    public Staff(String name, String address, int yearsOfService, double salary) {
        super(name, address);
        this.yearsOfService = yearsOfService;
        this.salary = salary; }

    //Getter for salary.
    public double getSalary() {
        return salary; }

    //override method. Formats string to output all attributes of the object.
    @Override
    public String toString() {
        return "Name = " + super.getName() + ", Address = " + super.getAddress() + ", Years = " + yearsOfService + ", Pay = $" + String.format("%.2f", salary); }
}