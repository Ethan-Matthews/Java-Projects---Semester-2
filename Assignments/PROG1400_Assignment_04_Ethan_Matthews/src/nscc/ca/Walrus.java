package nscc.ca;

public class Walrus extends Animal implements Loggable {

    private String dentalHealth;

    Walrus(String gender, int weight, GPS location, String dentalHealth) {
        super(gender, weight, location);
        this.dentalHealth = dentalHealth;
    }

    @Override
    public String toString() {
        return "Walrus";
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
