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

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
