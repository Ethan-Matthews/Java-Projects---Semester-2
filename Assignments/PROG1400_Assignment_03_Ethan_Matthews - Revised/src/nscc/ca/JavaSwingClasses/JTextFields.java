package nscc.ca.JavaSwingClasses;

import javax.swing.*;
import java.awt.*;

//Custom Class for JTextFields extends JTextField.
public class JTextFields extends JTextField {

    //Constructor
    public JTextFields(int xPos, int yPos, int width, int height, String text, int fontSize) {

        //Set bounds for label.
        this.setBounds(xPos, yPos, width, height);
        //Sets Text to sting provided.
        this.setText(text);
        //Sets Font to to custom font, and Size.
        this.setFont(new Font("Detente", Font.PLAIN, fontSize));
        //Sets background colour for Text Fields.
        this.setBackground(Color.GRAY);
        //Sets Text/border colour.
        this.setForeground(Color.BLACK);
        //Cannot Highlight and text in Text Field.
        this.setEditable(false);
        //Wraps text in Text area.
        this.setHighlighter(null);
    }
}
