package nscc.ca;

import javax.swing.*;
import java.awt.*;

public class JRadioButtons extends JRadioButton {
    private int xPos;
    private int yPos;
    private int width;
    private int height;
    private String text;
    private int fontSize;

    public JRadioButtons(int xPos, int yPos, int width, int height, String text, int fontSize) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.width = width;
        this.height = height;
        this.text = text;
        this.fontSize = fontSize;

        this.setBounds(xPos, yPos, width, height);
        this.setText(text);
        this.setFont(new Font("Mael", Font.PLAIN, fontSize));
        this.setBackground(Color.BLACK);
        this.setForeground(Color.WHITE);
        this.setFocusPainted(false);
    }
}