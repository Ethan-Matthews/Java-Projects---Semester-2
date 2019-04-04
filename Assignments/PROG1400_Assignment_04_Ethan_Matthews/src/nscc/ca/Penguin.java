package nscc.ca;

import javax.swing.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Penguin extends Animal implements Loggable {

    private double bloodPressure;
    //Constructor
    public Penguin(String gender, int weight, GPS location, double bloodPressure) {
        super(gender, weight, location);
        this.bloodPressure = bloodPressure;
    }

    public double getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    @Override
    public String toString() {
        return "Penguin";
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
