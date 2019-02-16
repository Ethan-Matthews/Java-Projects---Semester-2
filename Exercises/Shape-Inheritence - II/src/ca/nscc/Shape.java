package ca.nscc;

public class Shape {
    private int length;
    private int height;
    private String colour;

    public Shape(int length,
                 int height,
                 String colour) {
        this.length = length;
        this.height = height;
        this.colour = colour;
    }

    public String getArea() {
        String printString = "I calculated my Area!!!";
        return printString;
    }

}
