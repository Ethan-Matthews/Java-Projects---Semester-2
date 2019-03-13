package nscc.ca.JavaSwingClasses;

import javax.swing.*;
import java.awt.*;

//Custom Radio Button Class extends JRadioButton.
public class JRadioButtons extends JRadioButton {

    //Default Constructor.
    public JRadioButtons(int xPos, int yPos, int width, int height, String text, int fontSize) {

        //Sets size and position of RadioButton.
        this.setBounds(xPos, yPos, width, height);
        //Sets text of RadioButton to string provided.
        this.setText(text);
        //Sets Text/border colour.
        this.setFont(new Font("Mael", Font.PLAIN, fontSize));
        //Sets background colour on RadioButton.
        this.setBackground(Color.BLACK);
        //Sets foreground colour for radioButton.
        this.setForeground(Color.WHITE);
        //Sets the RadioButton to not selected by default.
        this.setFocusPainted(false);
    }
}