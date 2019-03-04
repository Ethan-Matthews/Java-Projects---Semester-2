package nscc.ca;

import javax.swing.*;
import java.awt.*;

public class JTextFields extends JTextField {

    private int xPos;
    private int yPos;
    private int width;
    private int height;
    private String text;
    private int fontSize;

    public JTextFields(int xPos, int yPos, int width, int height, String text, int fontSize) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.width = width;
        this.height = height;
        this.text = text;
        this.fontSize = fontSize;

        this.setBounds(xPos, yPos, width, height);
        this.setText(text);
        this.setFont(new Font("Detente", Font.PLAIN, fontSize));
        this.setBackground(Color.GRAY);
        this.setForeground(Color.BLACK);
        this.setEditable(false);
        this.setHighlighter(null);
    }
}
