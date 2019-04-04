package nscc.ca;

public class GPS implements Loggable {

    private String location;
    //Constructor
    GPS(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "";
    }


    @Override
    public void writeFile() {}
}
