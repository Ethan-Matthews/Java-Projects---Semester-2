package ca.nscc;
//Class Circles
public class Circles {
    //internal class Variables
    private String colour;
    private double radius;
    //Constructor 1 defaults
    public Circles() {
        this.colour = "Green";
        this.radius = 2;
    }
    //Constructor 2 radius
    public Circles(double radius) {
        this.radius = radius;
    }
    //constructors 3 colour
    public Circles(String colour) {
        this.colour = colour;
    }
    //getter radius
    public double getRadius() {
        return this.radius;
    }
    //getter colour
    public String getColour() {
        return this.colour;
    }
    //method area
    public double getArea(double radius) {
        double area = Math.pow((Math.PI * radius), 2);
        return area;
    }
    //method concatenate string
    public String toString(double radius, String colour) {
        String prString = "Radius = " + radius + " Colour = " + colour;
        return prString;
    }

}
