package ca.nscc;

import javax.swing.*;
import java.awt.*;

public class AppFrame extends JFrame {

    public AppFrame () {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 500);
        setLayout(new CardLayout());

        DrawingBoard draw = new DrawingBoard();
        add(draw);

    }

}
