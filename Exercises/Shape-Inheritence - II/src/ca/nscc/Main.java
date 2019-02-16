package ca.nscc;
import javax.swing.*;
import java.util.Random;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        String[] colourArray = {"Red", "Blue", "Green", "Yellow", "Purple", "Orange"};
        String[] triangleType = {"Scalene", "Equilateral", "Isosceles"};

        ArrayList TriangleArray = new ArrayList();
        ArrayList SquareArray = new ArrayList();
        ArrayList CircleArray = new ArrayList();

        String userNumber = JOptionPane.showInputDialog("How many shapes should be generated? ");

        int userCounter = Integer.parseInt(userNumber);

        for (int i = 0; i == userCounter; i++) {
            int randomNumber1 = (int)Math.random() * 5 + 0;
            int randomNumber2 = (int)Math.random() * 5 + 0;
            int randomNumber3 = (int)Math.random() * 5 + 0;
            int randomTriangleType = (int)Math.random() * 2 + 0;
            String randomColourT = colourArray[randomNumber1];
            String randomColourS = colourArray[randomNumber2];
            String randomColourC = colourArray[randomNumber3];
            String TriangleChoice = triangleType[randomTriangleType];

            TriangleArray.add(new Triangle(TriangleChoice, randomNumber1, randomNumber2, randomColourT));
            SquareArray.add(new Square(randomNumber3, randomNumber1, randomNumber2, randomColourS));
            CircleArray.add(new Circle(randomNumber3, randomNumber1, randomNumber2, randomColourC));
        }

        int totalShapes = userCounter * 3;



    }
}
