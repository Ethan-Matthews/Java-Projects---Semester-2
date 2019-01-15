public class House {

    //Property Properties/Constructors.
    int length;
    int width;
    String address;
    String colour;

    public House(int length) {
        this.length = length;
    }

    public House(int width) {
        this.width = width;
    }

    public House(String address) {
        this.address = address;
    }

    public House(String colour) {
        this.colour = colour;
    }


    //methods
    public void printTotalArea() {
        String totalArea = length * width;
        System.out.println("The Square footage is " + totalArea + "ft**");

    }

    public void printDescription() {
        System.out.println("I'm a Method that just printed to the console!");

    }

}
