package nscc.ca;

import javax.swing.*;
import java.awt.*;

public class AppFrame extends JFrame {

    public static void main(String[] args) {

        //Runs JFrame.
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    AppFrame frame = new AppFrame();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public AppFrame() {
        //AppFrame Settings.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 1000);
        setLocationRelativeTo(null);

        //Create content pane.
        JPanel contentPanel = new JPanel();
        setContentPane(contentPanel);
        contentPanel.setLayout(new CardLayout());

        //Add animation panel to contentPane.
        Animation animationPanel = new Animation();
        animationPanel.setBackground(Color.black);
        animationPanel.setLayout(null);
        contentPanel.add(animationPanel);

    }

}

