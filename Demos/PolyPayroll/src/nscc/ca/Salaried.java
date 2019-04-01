package nscc.ca;

public class Salaried extends Employee {

    private int yearsOfService;
    private double wholeSalary;
    private double rate;

    public Salaried(String firstName, String lastName, int yearsOfService, double wholeSalary, double rate) {
        super(firstName, lastName);
        this.yearsOfService = yearsOfService;
        this.wholeSalary = wholeSalary;
        this.rate = rate;
    }

    @Override
    public double calcMonthlyPay() {
        return (wholeSalary/yearsOfService) + (rate * yearsOfService);
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
