package ca.nscc;

public class Square extends Shape {

    private int DiagonalLength;

    public Square(int DiagonalLength,
                  int length,
                  int height) {
        super(length, height);
        this.DiagonalLength = DiagonalLength;
    }

}
