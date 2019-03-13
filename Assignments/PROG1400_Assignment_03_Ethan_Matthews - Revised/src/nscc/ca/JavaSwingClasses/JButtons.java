package nscc.ca.JavaSwingClasses;

import javax.swing.*;
import java.awt.*;
//Custom Class for JButtons extends from JButton.
public class JButtons extends JButton {

    private int xPos;
    private int yPos;
    private int width;
    private int height;
    private String text;
    private int fontSize;
    //Constructor.
    public JButtons(int xPos, int yPos, int width, int height, String text, int fontSize) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.width = width;
        this.height = height;
        this.text = text;
        this.fontSize = fontSize;
        //Set bounds for buttons.
        this.setBounds(xPos, yPos, width, height);
        //Sets Text to sting provided.
        this.setText(text);
        //Sets Font to to custom font, and Size.
        this.setFont(new Font("Mael", Font.PLAIN, fontSize));
        //Sets background colour for Buttons.
        this.setBackground(Color.BLACK);
        //Sets Text/border colour.
        this.setForeground(Color.WHITE);
        //Sets text alignment to Center horizontal.
        this.setHorizontalAlignment(JButton.CENTER);
        //Sets text to center vertical.
        this.setVerticalAlignment(JButton.CENTER);
        //Button is not Highlighted by default.
        this.setFocusPainted(false);

    }
}
