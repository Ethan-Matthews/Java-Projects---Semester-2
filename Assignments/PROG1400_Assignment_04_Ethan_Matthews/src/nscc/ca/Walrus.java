package nscc.ca;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Walrus extends Animal implements Loggable {

    private String dentalHealth;
    //Constructor
    Walrus(String gender, int weight, GPS location, String dentalHealth) {
        super(gender, weight, location);
        this.dentalHealth = dentalHealth;
    }

    public String getDentalHealth() {
        return dentalHealth;
    }

    public void setDentalHealth(String dentalHealth) {
        this.dentalHealth = dentalHealth;
    }

    @Override
    public String toString() {
        return "Walrus";
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
