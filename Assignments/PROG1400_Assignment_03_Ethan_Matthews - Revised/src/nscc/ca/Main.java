package nscc.ca;

import nscc.ca.JavaSwingClasses.JFrames;
import java.awt.*;

class Main {

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            //Creates new frame for main panels.
            try {
                JFrames frame = new JFrames();
                frame.setLayout(new CardLayout(0, 0));
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

    }
}
