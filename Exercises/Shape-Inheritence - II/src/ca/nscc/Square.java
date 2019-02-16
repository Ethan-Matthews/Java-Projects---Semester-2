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

}
