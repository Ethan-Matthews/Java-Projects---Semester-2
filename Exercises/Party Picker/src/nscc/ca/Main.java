package nscc.ca;

import javax.swing.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList guestList = new ArrayList();

        Object[] buttonOptions = {"Invited", "Not Invited"};

        JOptionPane.showMessageDialog(null,
                "Welcome to the party picker\n\n" +
                "Enter persons name and food type they're likely to bring,\n" +
                "then indicate if they're actually invited to the party or not.",
                "Message",
                JOptionPane.INFORMATION_MESSAGE);

        do {
            String firstName = JOptionPane.showInputDialog(null,
                    "Enter first name",
                    "Party Picker",
                    JOptionPane.OK_CANCEL_OPTION);

            String lastName = JOptionPane.showInputDialog(null,
                    "Enter last name",
                    "Party Picker",
                    JOptionPane.OK_CANCEL_OPTION);

            String food = JOptionPane.showInputDialog(null,
                    "Enter the food they're expected to bring",
                    "Party Picker",
                    JOptionPane.OK_CANCEL_OPTION);

            boolean invited = false;
            int choice = JOptionPane.showOptionDialog(null,
                    "Choose if the guess is invited or not",
                    "Party Picker",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.WARNING_MESSAGE,
                    null,
                    buttonOptions,
                    buttonOptions[1]);

            if (choice == 0) { 
                invited = true;
            }

            guestList.add(new Friend(firstName, lastName, invited, food));

        } while (JOptionPane.showConfirmDialog(null,
                "Enter another guest?",
                "Party Picker",
                JOptionPane.YES_NO_OPTION) == 0);






    }
}
