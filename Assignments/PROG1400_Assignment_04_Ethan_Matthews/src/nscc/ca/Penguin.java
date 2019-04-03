package nscc.ca;

public class Penguin extends Animal implements Loggable {

    private double bloodPressure;

    public Penguin(String gender, int weight, GPS location, double bloodPressure) {
        super(gender, weight, location);
        this.bloodPressure = bloodPressure;
    }

    public double getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    @Override
    public String toString() {
        return "Penguin";
    }

    @Override
    public String readFile(String FileName) {
        return null;
    }

    @Override
    public String writeFile(String FileName) {
        return null;
    }
}
