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

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public String getColour() {
        return colour;
    }
}
