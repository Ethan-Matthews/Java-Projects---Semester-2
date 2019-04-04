package nscc.ca;

public abstract class Animal {

    private String gender;
    private int weight;
    private GPS location;
    //Constructor
    Animal(String gender, int weight,GPS location) {
        this.gender = gender;
        this.weight = weight;
        this.location = location;
    }

    public GPS getGPS() { return location; }

    public void setGPS(GPS location) {
        this.location = location;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }



    @Override
    public abstract String toString();
}
