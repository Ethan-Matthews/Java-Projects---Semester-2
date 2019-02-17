package ca.nscc;

public class Square extends Shape {

    private int DiagonalLength;

    public Square(int DiagonalLength,
                  int length,
                  int height,
                  String colour) {
        super(length, height, colour);
        this.DiagonalLength = DiagonalLength;
    }

    public double getAreaSquare() {
        double areaSquare = getLength() * getHeight();
        return areaSquare;
    }

    @Override
    public String toString() {
        return "I'm a " + super.getColour() + " Square. My Diagonal Length is " + DiagonalLength + ". My area is " + getAreaSquare() + ".";
    }
}


