package nscc.ca.JavaSwingClasses;

import javax.swing.*;
import java.awt.*;
//Custom Class for JLables extends JLabel.
public class JLabels extends JLabel {

    private int xPos;
    private int yPos;
    private int width;
    private int height;
    private String text;
    private int fontSize;
    //Constructor.
    public JLabels(int xPos, int yPos, int width, int height, String text, int fontSize) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.width = width;
        this.height = height;
        this.text = text;
        this.fontSize = fontSize;
        //Set bounds for label.
        this.setBounds(xPos, yPos, width, height);
        //Sets Text to sting provided.
        this.setText(text);
        //Sets Font to to custom font, and Size.
        this.setFont(new Font("Mael", Font.PLAIN, fontSize));
        //Sets Text/border colour.
        this.setForeground(Color.WHITE);
        //Sets text alignment to Left horizontal.
        this.setHorizontalAlignment(JLabel.LEFT);
        //Sets text to center vertical.
        this.setVerticalAlignment(JLabel.CENTER);

    }


}

