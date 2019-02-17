package ca.nscc;

public class Circle extends Shape {

    private int radius;

    public Circle(int radius,
                  int length,
                  int height,
                  String colour) {
        super(length, height, colour);
        this.radius = radius;
    }

    public double getAreaCircle() {
        double areaCircle = Math.pow((3.14 * radius), 2);
        return areaCircle;
    }


    @Override
    public String toString() {
        return String.format("I'm a " + super.getColour() + " circle. My radius is " + radius + ". My area is " + getAreaCircle() + ".");
    }
}
