package nscc.ca;

public class Manager extends Employee {

    private double monthlyBonusAmount;
    private double baseSalary;

    public Manager(String firstName, String lastName, double monthlyBonusAmount, double baseSalary) {
        super(firstName, lastName);
        this.monthlyBonusAmount = monthlyBonusAmount;
        this.baseSalary = baseSalary;
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
    public double calcMonthlyPay() {
        return (baseSalary/24) + monthlyBonusAmount;
    }

    @Override
    public String toString() {
        return null;
    }
}
