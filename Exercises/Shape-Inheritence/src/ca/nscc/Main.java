package ca.nscc;

public class Main {

    public static void main(String[] args) {

        Circle Shape1 = new Circle(45,
                                     33,
                                     22);


        Triangle Shape2 = new Triangle("Scalene",
                                        20,
                                         33);

        Square Shape3 = new Square(22,
                                          11,
                                          33);
        System.out.println(Shape1.getArea());
        System.out.println(Shape2.getArea());
        System.out.println(Shape3.getArea());

    }
}
