package nscc.ca;

public class PieceWorker extends Employee {

    private double unitsProduced;
    private double price;

    public PieceWorker(String firstName, String lastName, double unitsProduced, double price) {
        super(firstName, lastName);
        this.unitsProduced = unitsProduced;
        this.price = price;
    }

    @Override
    public double calcMonthlyPay() {
        return (unitsProduced * price);
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
