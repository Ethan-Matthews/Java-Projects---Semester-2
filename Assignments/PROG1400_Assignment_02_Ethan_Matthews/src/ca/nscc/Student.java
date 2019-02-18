package ca.nscc;

public class Student extends Person {
    private int year;
    private double fee;

    public Student(String name,String address, int year, double fee) {
        super(name, address);
        this.year = year;
        this.fee = fee;
    }

    public double getFee() {
        return fee;
    }

    @Override
    public String toString() {
        return "Name = " + super.getName() + ", Address = " + super.getAddress() + ", Year = " + year +", Fee = $" + String.format("%.2f", fee); }

}
