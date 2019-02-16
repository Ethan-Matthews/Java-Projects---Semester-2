package ca.nscc;

import javax.swing.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //Message Box
        JOptionPane.showMessageDialog(null,
                "This is my first popup message!!!?",
                "My title goes here",
                JOptionPane.QUESTION_MESSAGE);


        //Confirm Dialog
        JOptionPane.showConfirmDialog(null,
                "Do you really Want to Quit?",
                "Make a choice.",
                JOptionPane.OK_CANCEL_OPTION);

        String myVar = JOptionPane.showInputDialog("Enter your name: ");
        System.out.println(myVar);


        Object[] myButtons = {"Green", "Blue", "Red", "Purple"};

        //Show Option
        int result = JOptionPane.showOptionDialog(null,
                "Pick a Colour",
                "Colour picker",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                myButtons,
                null);



        if (result == 0) {
            System.out.println("you picked Green");
        }

        else if (result == 1) {
            System.out.println("you picked Blue");
        }

        else if (result == 2) {
            System.out.println("you picked Red");
        }

        else if (result == 3) {
            System.out.println("you picked Purple");
        }


        ArrayList<Car> myGarage = new ArrayList<Car>();

        Car GeoffCar = new Car ("Toyota", "Accord");
        Car EthanCar = new Car ("Honda", "Civic");
        Car AlexCar = new Car ("Tom-mobile", "Jalopy");

        myGarage.add(GeoffCar);
        myGarage.add(EthanCar);
        myGarage.add(AlexCar);


    }
}
