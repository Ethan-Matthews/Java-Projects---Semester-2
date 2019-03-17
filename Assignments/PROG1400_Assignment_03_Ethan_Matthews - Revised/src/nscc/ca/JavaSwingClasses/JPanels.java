package nscc.ca.JavaSwingClasses;

import javax.swing.*;
import java.awt.*;

//Custom Class extends from JPanel.
public class JPanels extends JPanel {

    protected JPanels() {
        //Sets background colour for JPanel.
        setBounds(0, 0, 1000, 1000);
        setBackground(Color.BLACK);
        //Sets Layout to Null. (Already using card layout in SplashScreen.
        setLayout(null);
    }
}
