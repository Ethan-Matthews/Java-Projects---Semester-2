package nscc.ca;

public abstract class Animal {

    private String gender;
    private int weight;
    private GPS location;

    Animal(String gender, int weight,GPS location) {
        this.gender = gender;
        this.weight = weight;
        this.location = location;
    }

    public String getGender() {
        return gender;
    }

    public int getWeight() {
        return weight;
    }

    public GPS getGps() {
        return location;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setGps(GPS location) {
        this.location = location;
    }

    @Override
    public abstract String toString();
}
