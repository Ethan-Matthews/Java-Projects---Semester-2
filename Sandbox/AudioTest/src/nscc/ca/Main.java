package nscc.ca;

import sun.audio.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;


public class Main {

    public static class AudioL implements ActionListener {
        public final void actionPerformed(ActionEvent e) {
            Audio();
        }
    }

    public static void Audio() {
        AudioPlayer MPG = AudioPlayer.player;
        AudioStream BGM;
        AudioData MD;
        ContinuousAudioDataStream loop = null;

        try {
            BGM = new AudioStream(new FileInputStream("Sample.wav") {
            });
            MD = BGM.getData();
            loop = new ContinuousAudioDataStream(MD);


        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Error.");
            e.printStackTrace();
        }
        MPG.start(loop);

    }

    public static void main(String[] args) {
        Audio();
        JFrame main = new JFrame();
        main.setBounds(400, 400, 400, 400);
        JButton oneB = new JButton("Button");
        oneB.setBounds(100, 20, 30, 40);
        main.add(oneB);
        main.setVisible(true);

//        oneB.addActionListener(new AudioL());

    }
}

