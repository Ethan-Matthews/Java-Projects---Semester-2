package nscc.ca;

public class SeaLion extends Animal implements Loggable {

    private int numberOfSpots;

    public SeaLion(String gender, int weight, GPS location, int numberOfSpots) {
        super(gender, weight, location);
        this.numberOfSpots = numberOfSpots;
    }

    public int getNumberOfSpots() {
        return numberOfSpots;
    }

    public void setNumberOfSpots(int numberOfSpots) {
        this.numberOfSpots = numberOfSpots;
    }

    @Override
    public String toString() {
        return "SeaLion";
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
