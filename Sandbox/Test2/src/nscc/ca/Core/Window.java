package nscc.ca.Core;

import javax.swing.*;
import java.awt.*;

public class Window {

    public Window(int x, int y, String title, Game game) {

        game.setPreferredSize(new Dimension(x, y));
        game.setMaximumSize(new Dimension(x, y));
        game.setMinimumSize(new Dimension(x, y));

        JFrame frame= new JFrame(title);
        frame.add(game);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        game.start();

    }

}


