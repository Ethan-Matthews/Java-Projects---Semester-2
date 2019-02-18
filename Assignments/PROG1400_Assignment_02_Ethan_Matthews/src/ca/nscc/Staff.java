package ca.nscc;

public class Staff extends Person {
    private int yearsOfService;
    private double salary;

    public Staff(String name, String address, int yearsOfService, double salary) {
        super(name, address);
        this.yearsOfService = yearsOfService;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Name = " + super.getName() + ", Address = " + super.getAddress() + ", Years = " + yearsOfService + ", Pay = $" + String.format("%.2f", salary); }


}
