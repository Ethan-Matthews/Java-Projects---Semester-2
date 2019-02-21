package ca.nscc;
//Student subclass, uses attributes from person.
public class Student extends Person {
    //Private Student attributes.
    private int year;
    private double fee;

    //Student object constructor. Takes name and address from super person  class.
    public Student(String name,String address, int year, double fee) {
        super(name, address);
        this.year = year;
        this.fee = fee; }

    //Method for fee calculation.
    public double getFeeCalc() { return fee / 2 ; }

    //override method. Formats string to output all attributes of the object.
    @Override
    public String toString() {
        return "Name = " + super.getName() + ", Address = " + super.getAddress() + ", Year = " + year +", Fee = $" + String.format("%.2f", fee); }
}