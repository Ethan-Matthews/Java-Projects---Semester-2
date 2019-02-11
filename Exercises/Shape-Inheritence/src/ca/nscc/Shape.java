package ca.nscc;

public class Shape {
    private int length;
    private int height;

    public Shape(int length,
                 int height) {
        this.length = length;
        this.height = height;
    }

    public String getArea() {
        String printString = "I calculated my Area!!!";
        return printString;
    }

}
