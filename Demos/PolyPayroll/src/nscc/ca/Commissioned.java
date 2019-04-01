package nscc.ca;

public class Commissioned extends Employee {

    private double grossSales;
    private double baseSalary;

    public Commissioned(String firstName, String lastName, double grossSales, double baseSalary) {
        super(firstName, lastName);
        this.grossSales = grossSales;
        this.baseSalary = baseSalary;
    }

    public String getType() {
        return "Commissioned";
    }

    @Override
    public double calcMonthlyPay() {
        return baseSalary + (grossSales/10);
    }

    @Override
    public String getFirstName() {
        return null;
    }

    @Override
    public String getLastName() {
        return null;
    }

    @Override
    public String toString() {
        return null;
    }


}
