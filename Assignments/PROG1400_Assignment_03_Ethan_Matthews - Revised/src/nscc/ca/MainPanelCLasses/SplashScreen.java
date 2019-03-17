package nscc.ca.MainPanelCLasses;

import nscc.ca.JavaSwingClasses.*;
import javax.swing.*;

import static nscc.ca.JavaSwingClasses.JFrames.*;

//Custom JFrames class extends JFrame.
public class SplashScreen extends JPanels {

    //Constructor for 'Custom JFrames class'
    public SplashScreen() {
        this.setVisible(true);

        getBGM().loopContinuously();

        //Creates JLabel for splash screen Image.
        JLabels picLbP1 = new JLabels(242, 188, 816, 624, null, 0);
        //Adds splash screen image to Label.
        try {
            picLbP1.setIcon(new ImageIcon(getClass().getResource("/Images/CrossedSwords.png")));
            add(picLbP1);
        } catch (Exception ex) { ex.printStackTrace();}
        //JLabel for main title.
        JLabels titleLbP1 = new JLabels(0,0,1300,188, "FOOLS QUEST", 72);
        titleLbP1.setHorizontalAlignment(JLabel.CENTER);
        add(titleLbP1);
        //JButton for continuing to char creation.
        JButtons createBnP1 = new JButtons(400,850,500,75,"Create Character", 36);
        add(createBnP1);

        //Splash screen Create button action listener.
        createBnP1.addActionListener(e -> {
            getEffectGate().playOnce();
            setVisible(false);
            getCharacterSelectP2().setVisible(true);
        });
    }
}
