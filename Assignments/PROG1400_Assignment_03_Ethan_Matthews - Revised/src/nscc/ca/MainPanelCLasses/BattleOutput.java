package nscc.ca.MainPanelCLasses;

import nscc.ca.JavaSwingClasses.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;
import static nscc.ca.MainPanelCLasses.CharacterSelect.*;
import static nscc.ca.JavaSwingClasses.JFrames.*;

public class BattleOutput extends JPanels {

    private static JButtons nextBnP3;
    private static JButtons nextBn2P3;
    private static JButtons restartBnP3;

    private static JLabels classChoiceLbP3;
    private static JLabels picClassLbP3;
    private static JLabels picEnemyLbP3;
    private static JLabels monsterTypeLbP3;

    private static JTextAreas textOutTaP3;
    private static JTextAreas textOutTa2P3;
    private static JTextAreas textOutTa3P3;

    public BattleOutput() {
        setVisible(false);
        //Set Panel layout.
        setLayout(null);
        //JLabel for main title.
        JLabels titleLbP3 = new JLabels(15, 10, 960, 70, "BATTLE ONE", 48);
        titleLbP3.setHorizontalAlignment(JLabel.CENTER);
        add(titleLbP3);
        //JLabel for main title underline.
        JLabels titleULbP3 = new JLabels(15, 80, 960, 1, null, 0);
        titleULbP3.setBackground(Color.WHITE);
        Border borderP3 = BorderFactory.createLineBorder(Color.WHITE, 10);
        titleULbP3.setBorder(borderP3);
        add(titleULbP3);
        //JLabel for class chosen by user.
        classChoiceLbP3 = new JLabels(0, 150, 500, 40, null, 24);
        classChoiceLbP3.setHorizontalAlignment(JLabel.CENTER);
        add(classChoiceLbP3);
        //JLabel for monster class.
        monsterTypeLbP3 = new JLabels(500, 150, 500, 40, null, 24);
        monsterTypeLbP3.setHorizontalAlignment(JLabel.CENTER);
        add(monsterTypeLbP3);
        //VS JLabel.
        JLabels vs = new JLabels(450, 315, 100, 80, "VS", 72);
        add(vs);
        //JLabel for char class pic.
        picClassLbP3 = new JLabels(65,200, 302,280, null, 0);
        add(picClassLbP3);
        //JLabel for monster pic.
        picEnemyLbP3 = new JLabels(633,200, 302,280, null, 0);
        add(picEnemyLbP3);
        //Text area for first output.
        textOutTaP3 = new JTextAreas(15, 500, 963, 405, null, 18);
        add(textOutTaP3);
        //Text area for second output.
        textOutTa2P3 = new JTextAreas(15, 500, 963, 405, null, 18);
        textOutTa2P3.setVisible(false);
        add(textOutTa2P3);
        //Text area for third output.
        textOutTa3P3 = new JTextAreas(15, 500, 963, 405, null, 18);
        textOutTa3P3.setVisible(false);
        add(textOutTa3P3);
        //JButton for battle panel 1 to battle panel 2.
        nextBnP3 = new JButtons(440, 920, 120, 40, "NEXT", 24);
        add(nextBnP3);
        //JButton for battle panel 2 to battle panel 3.
        nextBn2P3 = new JButtons(440, 920, 120, 40, "NEXT", 24);
        nextBn2P3.setVisible(false);
        add(nextBn2P3);
        //JButton for resetting char generator.
        restartBnP3 = new JButtons(370, 920, 260, 40, "Roll Again?", 24);
        restartBnP3.setVisible(false);
        add(restartBnP3);

        //JButton next battle panels 1 to 2 action listener.
        nextBnP3.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            getNextEffect().playOnce();
            //Sets new enemy picture.
            try {
                picEnemyLbP3.setIcon(new ImageIcon(getClass().getResource("/Images/Skeleton_Warrior.png")));
            } catch (Exception ex){ ex.printStackTrace(); }
            //Changes Title.
            titleLbP3.setText("BATTLE TWO");
            //New monster type.
            monsterTypeLbP3.setText("Monster: Skeleton");
            //Appends skeleton toString to output text area.
            textOutTa2P3.append(getASkeleton().toString());
            //Changes visibility of battle panels and buttons.
            nextBn2P3.setVisible(true);
            nextBnP3.setVisible(false);
            textOutTaP3.setVisible(false);
            textOutTa2P3.setVisible(true);
            }
        });
        //JButton next battle panels 2 to 3 action listener.
        nextBn2P3.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            getNextEffect().playOnce();
            //Sets new enemy picture.
            try {
                picEnemyLbP3.setIcon(new ImageIcon(getClass().getResource("/Images/Dragon.png")));
            } catch (Exception ex) { ex.printStackTrace(); }
            //Changes Title.
            titleLbP3.setText("FINAL BATTLE");
            //New monster type.
            monsterTypeLbP3.setText("Monster: Dragon");
            textOutTa3P3.append(getADragon().toString());
            //Changes visibility of battle panels and buttons.
            nextBn2P3.setVisible(false);
            restartBnP3.setVisible(true);
            textOutTa2P3.setVisible(false);
            textOutTa3P3.setVisible(true);
            }
        });
        //JButton restart program action listener.
        restartBnP3.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            //Player restart sound.
            getRestartEffect().playOnce();
            //stops battle BGM.
            getBattleBGM().stopSound();
            //Resets BGM to frame 0.
            getBGM().reset();
            //Starts BGM in continuous loop.
            getBGM().loopContinuously();
            //Resets Tile on battle panel one.
            titleLbP3.setText("BATTLE ONE");
            //resets text of character stat button.
            getStatGenBnP2().setText("ROLL");
            //Sets next button 1 to visible.
            nextBnP3.setVisible(true);
            //Sets Text area 1 output visible.
            textOutTaP3.setVisible(true);
            //Sets text area 2 invisible.
            textOutTa2P3.setVisible(false);
            //Sets text area 3 invisible.
            textOutTa3P3.setVisible(false);
            //Sets restart button invisible.
            restartBnP3.setVisible(false);
            //Sets battle output panel 1 invisible.
            getBattleScreenP3().setVisible(false);
            //Clears char class selection.
            getCharClasses().clearSelection();
            //Clears weapon type selection.
            getWeaponClasses().clearSelection();
            //Defaults character pic.
            try {
                getPicClassLbP2().setIcon(new ImageIcon(getClass().getResource("/Images/silhouetteClass.png")));
            } catch (Exception ex) { ex.printStackTrace();}
            //Defaults weapon pic.
            try {
                getPicWeaponLbP2().setIcon(new ImageIcon(getClass().getResource("/Images/silhouetteWeapon.png")));
            } catch (Exception ex) { ex.printStackTrace();}
            //Clears player name.
            getPlayerNameTfP2().setText(null);
            //Clears all text in player stat text fields.
            getStrengthTfP2().setText(null);
            getVitalityTfP2().setText(null);
            getIntelligenceTfP2().setText(null);
            getDexterityTfP2().setText(null);
            //Clears all text in weapon stat text fields.
            getWAttackTfP2().setText(null);
            getWWeightTfP2().setText(null);
            getWSpecialTfP2().setText(null);
            //Clears all text in weapon description text areas.
            getWeaponDescription().setText(null);
            //Clears all text in class description text areas.
            getClassDescription().setText(null);
            }
        });
    }

    static JLabels getClassChoiceLbP3() {
        return classChoiceLbP3;
    }

    static JLabels getPicClassLbP3() {
        return picClassLbP3;
    }

    static JTextAreas getTextOutTaP3() {
        return textOutTaP3;
    }

    static JLabels getPicEnemyLbP3() {
        return picEnemyLbP3;
    }

    static JLabels getMonsterTypeLbP3() {
        return monsterTypeLbP3;
    }

    static JTextAreas getTextOutTa2P3() { return textOutTa2P3; }

    static JTextAreas getTextOutTa3P3() { return textOutTa3P3; }
}
