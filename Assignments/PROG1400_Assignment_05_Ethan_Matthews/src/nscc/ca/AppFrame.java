package nscc.ca;

import javax.swing.*;
import java.awt.*;

public class AppFrame extends JFrame {

    public AppFrame() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 426);
        getContentPane().setLayout(new CardLayout());
        Animation.getActiveObjectList().add(new HourGlass(getX(),getY()));
        Animation animation = new Animation();
        getContentPane().add(animation);
    }

}
