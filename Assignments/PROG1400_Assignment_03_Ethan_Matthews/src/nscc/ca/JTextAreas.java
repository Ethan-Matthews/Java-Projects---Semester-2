package nscc.ca;

import javax.swing.*;
import java.awt.*;

public class JTextAreas extends JTextArea {
    private int xPos;
    private int yPos;
    private int width;
    private int height;
    private String text;
    private int fontSize;

    public JTextAreas(int xPos, int yPos, int width, int height, String text, int fontSize) {
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
        this.setFont(new Font("Detente", Font.PLAIN, fontSize));
        //Sets Background colour for TextAreas.
        this.setBackground(Color.GRAY);
        //Sets Text/border colour.
        this.setForeground(Color.BLACK);
        //Cannot edit this text Area.  Only for displaying information.
        this.setEditable(false);
        //Cannot Highlight and text in Text Area.
        this.setHighlighter(null);
        //Wraps text in Text area.
        this.setLineWrap(true);
    }
}
