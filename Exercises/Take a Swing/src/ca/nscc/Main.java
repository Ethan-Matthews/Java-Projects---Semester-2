package ca.nscc;
import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        JFrame mainFrame = new JFrame();
        mainFrame.setBounds(550, 375, 800, 400);
        mainFrame.setVisible(true);

        Color myBlue = new Color(0, 0, 255);
        Color myRed = new Color(255, 0, 0);

        JButton myButtonLeft = new JButton("Toggle Left");
        myButtonLeft.setBounds(140, 0, 125, 50);
        mainFrame.add(myButtonLeft);

        JButton myButtonRight = new JButton("Toggle Right");
        myButtonRight.setBounds(540, 0, 125, 50);
        mainFrame.add(myButtonRight);

        JPanel leftJPanel = new JPanel();
        leftJPanel.setBackground(myBlue);
        leftJPanel.setBounds(0,50, 400, 350);
        mainFrame.add(leftJPanel);

        JPanel rightJPanel = new JPanel();
        rightJPanel.setBackground(myRed);
        rightJPanel.setBounds(400, 50, 400, 350);
        mainFrame.add(rightJPanel);

//        JLabel leftText = new JLabel("This is the Left Panel");
//        leftText.setBounds(140, 100, 125, 50);
//        leftJPanel.add(leftText);
//
//        JLabel rightText = new JLabel("This is the Right Panel");
//        rightText.setBounds(540, 100, 125, 50);
//        rightJPanel.add(rightText);

//        leftJPanel.add(myButton);

        mainFrame.setLayout(null);


    }
}
