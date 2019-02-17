package ca.nscc;

public class Triangle extends Shape {

    private String Type;

    public Triangle(String Type,
                    int length,
                    int height,
                    String colour) {
        super(length, height, colour);
        this.Type = Type;
    }

    public double getAreaTriangle() {
        double areaTriangle = (getLength()/2) * getHeight();
        return areaTriangle;
    }

    @Override
    public String toString() {
        return "I'm a " + super.getColour() + " Triangle. My Type is " + Type + ". My area is " + getAreaTriangle() + ".";
    }

}
