package ca.nscc;

import javax.swing.*;
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

        for (int i = 0; i < userCounter; i++) {
            int randomNumber1 = (int)(Math.random() * 5);
            int randomNumber2 = (int)(Math.random() * 5);
            int randomNumber3 = (int)(Math.random() * 5);
            int randomTriangleType = (int)(Math.random() * 2);
            String randomColourT = colourArray[randomNumber1];
            String randomColourS = colourArray[randomNumber2];
            String randomColourC = colourArray[randomNumber3];
            String TriangleChoice = triangleType[randomTriangleType];

            TriangleArray.add(new Triangle(TriangleChoice, randomNumber1, randomNumber2, randomColourT));
            SquareArray.add(new Square(randomNumber3, randomNumber1, randomNumber2, randomColourS));
            CircleArray.add(new Circle(randomNumber3, randomNumber1, randomNumber2, randomColourC));
        }

        int totalShapes = userCounter * 3;

        String output = "";

        for (int i = 0; i < TriangleArray.size(); i++) {
            output += "\n" + TriangleArray.get(i).toString();
        }

        output += "\n";

        for (int i = 0; i < SquareArray.size(); i++) {
            output += "\n" + SquareArray.get(i).toString();
        }

        output += "\n";

        for (int i = 0; i < CircleArray.size(); i++) {
            output += "\n" + CircleArray.get(i).toString();
        }

        JOptionPane.showMessageDialog(null , "\n" + output);

    }
}
