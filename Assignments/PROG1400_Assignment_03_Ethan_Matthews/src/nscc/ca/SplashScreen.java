package nscc.ca;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class SplashScreen extends JFrameClass {

    public SplashScreen() {

        Sound BGM = new Sound("Audio/Theme1.wav");
        BGM.loopContinuously();

        JPanel contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(1, 1, 1, 1));
        setContentPane(contentPane);
        contentPane.setLayout(new CardLayout(0, 0));


//------FIRST J PANEL SPLASH SCREEN--------------------------------------------


        JPanel splashScreen = new JPanel();
        splashScreen.setBackground(Color.BLACK);
        contentPane.add(splashScreen);
        splashScreen.setLayout(null);

        JLabel picLbP1 = new JLabel();
        picLbP1.setIcon(new ImageIcon(getClass().getResource("/Images/CrossedSwords.png")));
        picLbP1.setBounds(92, 188, 816, 624);
        splashScreen.add(picLbP1);

        JLabel titleLbP1 = new JLabel("HEROES QUEST");
        titleLbP1.setBounds(0, 0, 1000, 188);
        titleLbP1.setFont(new Font("Mael", Font.PLAIN, 72));
        titleLbP1.setForeground(Color.WHITE);
        titleLbP1.setHorizontalAlignment(JLabel.CENTER);
        titleLbP1.setVerticalAlignment(JLabel.CENTER);
        splashScreen.add(titleLbP1);

        JButton createBnP1 = new JButton("Create Character");
        createBnP1.setBounds(250, 850, 500, 75);
        createBnP1.setFont(new Font("Mael", Font.PLAIN, 36));
        createBnP1.setBackground(Color.BLACK);
        createBnP1.setForeground(Color.WHITE);
        createBnP1.setHorizontalAlignment(JButton.CENTER);
        createBnP1.setVerticalAlignment(JButton.CENTER);
        createBnP1.setFocusPainted(false);
        splashScreen.add(createBnP1);


//------SECOND J PANEL CHARACTER GENERATOR--------------------------------------


        JPanel charCreator = new JPanel();
        charCreator.setBackground(Color.BLACK);
        contentPane.add(charCreator);
        charCreator.setLayout(null);

        JLabel titleLbP2 = new JLabel("CHARACTER GENERATOR");
        titleLbP2.setBounds(15, 10, 960, 70);
        titleLbP2.setFont(new Font("Mael", Font.PLAIN, 48));
        titleLbP2.setForeground(Color.WHITE);

        JLabel titleULbP2 = new JLabel("");
        titleULbP2.setBounds(15, 80, 960, 1);
        titleULbP2.setBackground(Color.WHITE);

        Border border5 = BorderFactory.createLineBorder(Color.WHITE, 10);
        titleULbP2.setBorder(border5);

        charCreator.add(titleLbP2);
        charCreator.add(titleULbP2);


        JLabel enterNameLbP2 = new JLabel("ENTER NAME:");
        enterNameLbP2.setBounds(15, 100, 180, 75);
        enterNameLbP2.setFont(new Font("Mael", Font.PLAIN, 24));
        enterNameLbP2.setForeground(Color.WHITE);

//        Border border4 = BorderFactory.createLineBorder(Color.WHITE, 1);
//        enterNameLbP2.setBorder(border4);

        charCreator.add(enterNameLbP2);


        JLabel CharTypeLbP2 = new JLabel("CHARACTER CLASS");
        CharTypeLbP2.setBounds(15, 175, 250, 50);
        CharTypeLbP2.setFont(new Font("Mael", Font.PLAIN, 24));
        CharTypeLbP2.setForeground(Color.WHITE);

//        Border border2 = BorderFactory.createLineBorder(Color.WHITE, 1);
//        CharTypeLbP2.setBorder(border2);

        charCreator.add(CharTypeLbP2);


        JLabel charStatsLbP2 = new JLabel("CHARACTER STATS");
        charStatsLbP2.setBounds(600, 175, 280, 50);
        charStatsLbP2.setFont(new Font("Mael", Font.PLAIN, 24));
        charStatsLbP2.setForeground(Color.WHITE);

//        Border border3 = BorderFactory.createLineBorder(Color.WHITE, 1);
//        CharStatsLbP2.setBorder(border3);

        charCreator.add(charStatsLbP2);

        JLabel picClassLbP2 = new JLabel();
        picClassLbP2.setBounds(275, 225, 302, 280);

//        Border border6 = BorderFactory.createLineBorder(Color.WHITE, 2);
//        picClassLbP2.setBorder(border6);

        charCreator.add(picClassLbP2);

        JLabel picWeaponLbP2 = new JLabel();
        picWeaponLbP2.setBounds(325, 690, 250, 130);

//        Border border6 = BorderFactory.createLineBorder(Color.WHITE, 2);
//        picWeaponLbP2.setBorder(border6);

        charCreator.add(picWeaponLbP2);


        JTextArea classDescription = new JTextArea();
        classDescription.setBounds(15, 515, 562, 110);
        classDescription.setFont(new Font("Detente", Font.PLAIN, 16));
        classDescription.setBackground(Color.GRAY);
        classDescription.setForeground(Color.BLACK);
        classDescription.setEditable(false);
        classDescription.setHighlighter(null);
        classDescription.setLineWrap(true);
        charCreator.add(classDescription);

        JLabel weaponLbP2 = new JLabel("WEAPON TYPE");
        weaponLbP2.setBounds(15, 640, 250, 50);
        weaponLbP2.setFont(new Font("Mael", Font.PLAIN, 24));
        weaponLbP2.setForeground(Color.WHITE);
        charCreator.add(weaponLbP2);

        JTextArea weaponDescription = new JTextArea();
        weaponDescription.setBounds(15, 845, 562, 110);
        weaponDescription.setFont(new Font("Detente", Font.PLAIN, 16));
        weaponDescription.setBackground(Color.GRAY);
        weaponDescription.setForeground(Color.BLACK);
        weaponDescription.setEditable(false);
        weaponDescription.setHighlighter(null);
        weaponDescription.setLineWrap(true);
        charCreator.add(weaponDescription);


        JRadioButton radioMage = new JRadioButton(" Mage");
        radioMage.setFont(new Font("Mael", Font.PLAIN, 20));
        radioMage.setBackground(Color.BLACK);
        radioMage.setForeground(Color.WHITE);
        radioMage.setBounds(35, 255, 150, 50);
        radioMage.setFocusPainted(false);
        charCreator.add(radioMage);

        JRadioButton radioPaladin = new JRadioButton(" Paladin");
        radioPaladin.setFont(new Font("Mael", Font.PLAIN, 20));
        radioPaladin.setBackground(Color.BLACK);
        radioPaladin.setForeground(Color.WHITE);
        radioPaladin.setBounds(35, 325, 150, 50);
        radioPaladin.setFocusPainted(false);
        charCreator.add(radioPaladin);

        JRadioButton radioRanger = new JRadioButton(" Ranger");
        radioRanger.setFont(new Font("Mael", Font.PLAIN, 20));
        radioRanger.setBackground(Color.BLACK);
        radioRanger.setForeground(Color.WHITE);
        radioRanger.setBounds(35, 395, 150, 50);
        radioRanger.setFocusPainted(false);
        charCreator.add(radioRanger);

        ButtonGroup charClasses = new ButtonGroup();
        charClasses.add(radioMage);
        charClasses.add(radioPaladin);
        charClasses.add(radioRanger);


        JRadioButton radioSword = new JRadioButton(" Sword");
        radioSword.setFont(new Font("Mael", Font.PLAIN, 20));
        radioSword.setBackground(Color.BLACK);
        radioSword.setForeground(Color.WHITE);
        radioSword.setBounds(35, 690, 120, 30);
        radioSword.setFocusPainted(false);
        charCreator.add(radioSword);

        JRadioButton radioStaff = new JRadioButton(" Staff");
        radioStaff.setFont(new Font("Mael", Font.PLAIN, 20));
        radioStaff.setBackground(Color.BLACK);
        radioStaff.setForeground(Color.WHITE);
        radioStaff.setBounds(35, 740, 120, 30);
        radioStaff.setFocusPainted(false);
        charCreator.add(radioStaff);

        JRadioButton radioBow = new JRadioButton(" Bow");
        radioBow.setFont(new Font("Mael", Font.PLAIN, 20));
        radioBow.setBackground(Color.BLACK);
        radioBow.setForeground(Color.WHITE);
        radioBow.setBounds(35, 790, 120, 30);
        radioBow.setFocusPainted(false);
        charCreator.add(radioBow);

        ButtonGroup weaponClasses = new ButtonGroup();
        weaponClasses.add(radioSword);
        weaponClasses.add(radioStaff);
        weaponClasses.add(radioBow);




        //Splash screen Create button action listener.
        createBnP1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Sound effectGate = new Sound("Audio/Gate2.wav");
                effectGate.playOnce();
                splashScreen.setVisible(false);
                charCreator.setVisible(true);
            }
        });

        radioMage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Sound effectThunder = new Sound("Audio/Thunder10.wav");
                picClassLbP2.setIcon(new ImageIcon(getClass().getResource("/Images/Mage.png")));
                classDescription.setText(" THE MAGE\n A MASTER OF THE ELEMENTS AND ARCANE ARTS. HIGH\n INTELLIGENCE AND DEXTERITY, LOW VITALITY AND STRENGTH.");
                effectThunder.playOnce();

            }
        });

        radioPaladin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Sound effectSwords = new Sound("Audio/Sword6.wav");
                picClassLbP2.setIcon(new ImageIcon(getClass().getResource("/Images/Paladin.png")));
                classDescription.setText(" THE PALADIN\n A HOLY WARRIOR BLESSED BY THE LIGHT. HIGH VITALITY AND\n STRENGTH, LOW INTELLIGENCE AND DEXTERITY.");
                effectSwords.playOnce();

            }
        });

        radioRanger.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Sound effectBow = new Sound("Audio/Bow4.wav");
                picClassLbP2.setIcon(new ImageIcon(getClass().getResource("/Images/Ranger.png")));
                classDescription.setText(" THE RANGER\n SKILLED WITH THE USE OF LONG RANGE WEAPONS. HIGH\n DEXTERITY AND INTELLIGENCE, LOW STRENGTH AND VITALITY.");
                effectBow.playOnce();

            }
        });

        radioSword.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Sound effectEquip = new Sound("Audio/Equip1.wav");
                picWeaponLbP2.setIcon(new ImageIcon(getClass().getResource("/Images/sword_3.png")));
                weaponDescription.setText(" THE SWORD\n A ONE HANDED BLADE. MOST BASIC OF MELEE WEAPONS.\n HAS BONUS ATTACK MODIFIER.");
                effectEquip.playOnce();

            }
        });

        radioStaff.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Sound effectEquip = new Sound("Audio/Equip2.wav");
                picWeaponLbP2.setIcon(new ImageIcon(getClass().getResource("/Images/staff.png")));
                weaponDescription.setText(" THE STAFF\n A TWO HANDED STAFF. PERFECT FOR CHANNELING ARCANE\n POWER. HAS BONUS SPELL CHARGES.");
                effectEquip.playOnce();

            }
        });

        radioBow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Sound effectEquip = new Sound("Audio/Equip3.wav");
                picWeaponLbP2.setIcon(new ImageIcon(getClass().getResource("/Images/Bow2.png")));
                weaponDescription.setText(" THE BOW\n A BOW AND ARROWS. A RANGERS BEST FRIEND.\n HAS BONUS RANGE MODIFIER.");
                effectEquip.playOnce();

            }
        });





    }



}