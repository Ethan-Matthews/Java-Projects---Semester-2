package nscc.ca;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class SeaLion extends Animal implements Loggable {

    private int numberOfSpots;
    //Constructor
    public SeaLion(String gender, int weight, GPS location, int numberOfSpots) {
        super(gender, weight, location);
        this.numberOfSpots = numberOfSpots;
    }

    public void setNumberOfSpots(int numberOfSpots) {
        this.numberOfSpots = numberOfSpots;
    }

    @Override
    public String toString() {
        return "SeaLion";
    }

    //Writes gps locations to file.
    @Override
    public void writeFile() {
        byte[] data = this.getGPS().getLocation().getBytes();
        try {
            Path filePath = Paths.get("src\\Files\\GPS.txt");
            Files.write(filePath, data, StandardOpenOption.APPEND);
        } catch (Exception e) {e.printStackTrace();}
    }
}
