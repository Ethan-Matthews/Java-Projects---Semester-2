package nscc.ca;

import javax.swing.*;
import java.awt.*;
//Custom JFrames class extends JFrame.
public abstract class JFrames extends JFrame {
    //Constructor for 'Custom JFrames class'
    public JFrames() {
        setDefaultCloseOperation(JFrames.EXIT_ON_CLOSE);
        //Title for Program Windows.
        setTitle("Heroes Quest RPG Character Creator");
        //Sets Default Size for Frame.
        setSize(1000, 1000);
        //Makes the Program start at the center of the monitor regardless of resolution.
        Dimension Center = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(Center.width/2-this.getSize().width/2, Center.height/2-this.getSize().height/2);
        setResizable(false);



    }
}
