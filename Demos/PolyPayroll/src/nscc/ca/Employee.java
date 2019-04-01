package nscc.ca;

public abstract class Employee {

    private String firstName;
    private String lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public abstract double calcMonthlyPay();

    public abstract String getFirstName();

    public abstract String getLastName();

    public abstract String toString();


}
