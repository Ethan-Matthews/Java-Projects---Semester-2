package nscc.ca;
import nscc.ca.JavaSwingClasses.GUIPanels;

import java.awt.*;


public class Main {

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                //Creates new frame for main panels.
                try {
                    GUIPanels frame = new GUIPanels();
                    frame.setLayout(new CardLayout(0, 0));
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

    }
}
