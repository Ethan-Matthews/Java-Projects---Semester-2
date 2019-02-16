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

}
