package ca.nscc;

public class Triangle extends Shape {

    private String Type;

    public Triangle(String Type,
                    int length,
                    int height) {
        super(length, height);
        this.Type = Type;


    }

}
