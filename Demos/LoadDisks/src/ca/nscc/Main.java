package ca.nscc;

public class Main {

    public static void main(String[] args) {
        //circle with defaults
        Circles circle1 = new Circles();
        //circle with radius
        Circles circle2 = new Circles(54);
        //circle with colour
        Circles circle3 = new Circles("red");

        circle1.toString();

        System.out.println();

    }
}
