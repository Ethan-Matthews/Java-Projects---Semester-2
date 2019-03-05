package nscc.ca;

import javax.swing.*;
import java.awt.*;

public abstract class JFrames extends JFrame {

    public JFrames() {
        setDefaultCloseOperation(JFrames.EXIT_ON_CLOSE);
        setTitle("Heroes Quest RPG Character Creator");
        setSize(1000, 1000);
        //Found how to center the JFrame with out a lot of hassle.
        //https://stackoverflow.com/questions/2442599/how-to-set-jframe-to-appear-centered-regardless-of-monitor-resolution
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        setResizable(false);



    }
}
