package nscc.ca;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileInputStream;

public class SplashScreen extends JFrameClass {

    public String randomGenerator() {
        int number = (int)(Math.random()* 20 + 1);
        String randomStat = Integer.toString(number);
        return randomStat;
    }


    public SplashScreen() {

        Sound BGM = new Sound("Audio/Theme1.wav");
        BGM.loopContinuously();

        Staff staff = new Staff(25, 5, 2);
        Sword sword = new Sword(20, 30, 5);
        Bow bow = new Bow(10, 20, 10);

        int spellPower = 2;
        int healBonus = 3;
        int rangeBonus = 2;


//------FIRST J PANEL SPLASH SCREEN--------------------------------------------


        JPanel contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(1, 1, 1, 1));
        setContentPane(contentPane);
        contentPane.setLayout(new CardLayout(0, 0));

        JPanels splashScreen = new JPanels();
        splashScreen.setLayout(null);
        contentPane.add(splashScreen);

        JLabels picLbP1 = new JLabels(92, 188, 816, 624, null, 0);
        picLbP1.setIcon(new ImageIcon(getClass().getResource("/Images/CrossedSwords.png")));
        splashScreen.add(picLbP1);

        JLabels titleLbP1 = new JLabels(0,0,1000,188, "HEROES QUEST", 72);
        titleLbP1.setHorizontalAlignment(JLabel.CENTER);
        splashScreen.add(titleLbP1);

        JButtons createBnP1 = new JButtons(250,850,500,75,"Create Character", 36);
        splashScreen.add(createBnP1);


//------SECOND J PANEL CHARACTER GENERATOR--------------------------------------


        JPanels charCreator = new JPanels();
        charCreator.setLayout(null);
        contentPane.add(charCreator);


        JLabels titleLbP2 = new JLabels(15, 10, 960, 70, "CHARACTER GENERATION", 48);
        titleLbP2.setHorizontalAlignment(JButton.LEFT);
        charCreator.add(titleLbP2);

        JLabels titleULbP2 = new JLabels(15, 80, 960, 1, null, 0);
        titleULbP2.setBackground(Color.WHITE);
        Border border5 = BorderFactory.createLineBorder(Color.WHITE, 10);
        titleULbP2.setBorder(border5);
        charCreator.add(titleULbP2);

        JLabels enterNameLbP2 = new JLabels(15, 100, 180, 75, "ENTER NAME:", 24);
        charCreator.add(enterNameLbP2);

        JLabels CharTypeLbP2 = new JLabels(15, 175, 250, 50, "CHARACTER CLASS", 24);
        charCreator.add(CharTypeLbP2);

        JLabels charStatsLbP2 = new JLabels(600, 175, 280, 50, "CHARACTER STATS", 24);
        charCreator.add(charStatsLbP2);

        JLabels weaponLbP2 = new JLabels(15, 640, 250, 50, "WEAPON TYPE", 24);
        charCreator.add(weaponLbP2);

        JLabels weaponStatsLbP2 = new JLabels(600, 640, 250, 50, "WEAPON STATS", 24);
        charCreator.add(weaponStatsLbP2);

        JLabels strengthLbP2 = new JLabels(600, 255, 150, 30, "Strength", 20);
        charCreator.add(strengthLbP2);

        JLabels vitalityLbP2 = new JLabels(600, 305, 280, 30, "Vitality", 20);
        charCreator.add(vitalityLbP2);

        JLabels intelligenceLbP2 = new JLabels(600, 355, 280, 30, "Intelligence", 20);
        charCreator.add(intelligenceLbP2);

        JLabels dexterityLbP2 = new JLabels(600, 405, 280, 30, "Dexterity", 20);
        charCreator.add(dexterityLbP2);

        JLabels wAttackLbP2 = new JLabels(600, 690, 280, 30, "Attack", 20);
        charCreator.add(wAttackLbP2);

        JLabels wWeightLbP2 = new JLabels(600, 740, 280, 30, "Weight", 20);
        charCreator.add(wWeightLbP2);

        JLabels wSpecialLbP2 = new JLabels(600, 790, 280, 30, "Special", 20);
        charCreator.add(wSpecialLbP2);

        JLabels picClassLbP2 = new JLabels(275, 225, 302, 280, null, 0);
        charCreator.add(picClassLbP2);

        JLabels picWeaponLbP2 = new JLabels(325, 690, 250, 130, null, 0);
        charCreator.add(picWeaponLbP2);



        JTextFields playerNameTfP2 = new JTextFields(215, 110, 180, 40, null, 24);
        playerNameTfP2.setEditable(true);
        playerNameTfP2.setHighlighter(null);
        charCreator.add(playerNameTfP2);

        JTextFields strengthTfP2 = new JTextFields(850, 255, 35, 30, null, 16);
        charCreator.add(strengthTfP2);

        JTextFields vitalityTfP2 = new JTextFields(850, 305, 35, 30, null, 16);
        charCreator.add(vitalityTfP2);

        JTextFields intelligenceTfP2 = new JTextFields(850, 355, 35, 30, null, 16);
        charCreator.add(intelligenceTfP2);

        JTextFields dexterityTfP2 = new JTextFields(850, 405, 35, 30, null, 16);
        charCreator.add(dexterityTfP2);

        JTextFields wAttackTfP2 = new JTextFields(850, 690, 35, 30, null, 16);
        charCreator.add(wAttackTfP2);

        JTextFields wWeightTfP2 = new JTextFields(850, 740, 35, 30, null, 16);
        charCreator.add(wWeightTfP2);

        JTextFields wSpecialTfP2 = new JTextFields(850, 790, 35, 30, null, 16);
        charCreator.add(wSpecialTfP2);



        JButtons statGenBnP2 = new JButtons(720, 475, 125, 40, "ROLL", 24);
        charCreator.add(statGenBnP2);

        JButtons battleBnP2 = new JButtons(660, 860, 250, 40,"START BATTLE",24);
        charCreator.add(battleBnP2);



        JTextAreas classDescription = new JTextAreas(15, 515, 562, 110, null, 16);
        charCreator.add(classDescription);

        JTextAreas weaponDescription = new JTextAreas(15, 845, 562, 110, null, 16);
        charCreator.add(weaponDescription);



        JRadioButtons radioMage = new JRadioButtons(35, 255, 150, 50," Mage", 20);
        charCreator.add(radioMage);

        JRadioButtons radioPaladin = new JRadioButtons(35, 325, 150, 50, " Paladin", 20);
        charCreator.add(radioPaladin);

        JRadioButtons radioRanger = new JRadioButtons(35, 395, 150, 50, " Ranger", 20);
        charCreator.add(radioRanger);

        JRadioButtons radioSword = new JRadioButtons(35, 690, 120, 30, " Sword", 20);
        charCreator.add(radioSword);

        JRadioButtons radioStaff = new JRadioButtons(35, 740, 120, 30, " Staff", 20);
        charCreator.add(radioStaff);

        JRadioButtons radioBow = new JRadioButtons(35, 790, 120, 30, " Bow", 20);
        charCreator.add(radioBow);

        ButtonGroup charClasses = new ButtonGroup();
        charClasses.add(radioMage);
        charClasses.add(radioPaladin);
        charClasses.add(radioRanger);

        ButtonGroup weaponClasses = new ButtonGroup();
        weaponClasses.add(radioSword);
        weaponClasses.add(radioStaff);
        weaponClasses.add(radioBow);

//------THIRD J PANEL BATTLE OUTPUT--------------------------------------


        JPanels battleOutput = new JPanels();
        charCreator.setLayout(null);
        contentPane.add(battleOutput);

        JTextAreas CharCheck = new JTextAreas(15, 845, 562, 110, "", 16);
        charCreator.add(CharCheck);





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

        battleBnP2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (radioMage.isSelected()) {
                    if (radioSword.isSelected()) {
                        Mage playerChar = new Mage( playerNameTfP2.getText(), sword, Integer.parseInt(strengthTfP2.getText()), Integer.parseInt(vitalityTfP2.getText()),Integer.parseInt(intelligenceTfP2.getText()), Integer.parseInt(dexterityTfP2.getText()), spellPower );
                    }
                    if (radioStaff.isSelected()) {
                        Mage playerChar = new Mage( playerNameTfP2.getText(), staff, Integer.parseInt(strengthTfP2.getText()), Integer.parseInt(vitalityTfP2.getText()),Integer.parseInt(intelligenceTfP2.getText()), Integer.parseInt(dexterityTfP2.getText()), spellPower );
                    }
                    if (radioBow.isSelected()) {
                        Mage playerChar = new Mage( playerNameTfP2.getText(), bow, Integer.parseInt(strengthTfP2.getText()), Integer.parseInt(vitalityTfP2.getText()),Integer.parseInt(intelligenceTfP2.getText()), Integer.parseInt(dexterityTfP2.getText()), spellPower );
                    }
                }

                if (radioPaladin.isSelected()) {
                    if (radioSword.isSelected()) {
                        Paladin playerChar = new Paladin( playerNameTfP2.getText(), sword, Integer.parseInt(strengthTfP2.getText()), Integer.parseInt(vitalityTfP2.getText()),Integer.parseInt(intelligenceTfP2.getText()), Integer.parseInt(dexterityTfP2.getText()), healBonus );
                    }
                    if (radioStaff.isSelected()) {
                        Paladin playerChar = new Paladin( playerNameTfP2.getText(), staff, Integer.parseInt(strengthTfP2.getText()), Integer.parseInt(vitalityTfP2.getText()),Integer.parseInt(intelligenceTfP2.getText()), Integer.parseInt(dexterityTfP2.getText()), healBonus );
                    }
                    if (radioBow.isSelected()) {
                        Paladin playerChar = new Paladin( playerNameTfP2.getText(), bow, Integer.parseInt(strengthTfP2.getText()), Integer.parseInt(vitalityTfP2.getText()),Integer.parseInt(intelligenceTfP2.getText()), Integer.parseInt(dexterityTfP2.getText()), healBonus );
                    }

                }

                if (radioRanger.isSelected()) {
                    if (radioSword.isSelected()) {
                        Ranger playerChar = new Ranger( playerNameTfP2.getText(), sword, Integer.parseInt(strengthTfP2.getText()), Integer.parseInt(vitalityTfP2.getText()),Integer.parseInt(intelligenceTfP2.getText()), Integer.parseInt(dexterityTfP2.getText()), rangeBonus );
                    }
                    if (radioStaff.isSelected()) {
                        Ranger playerChar = new Ranger( playerNameTfP2.getText(), staff, Integer.parseInt(strengthTfP2.getText()), Integer.parseInt(vitalityTfP2.getText()),Integer.parseInt(intelligenceTfP2.getText()), Integer.parseInt(dexterityTfP2.getText()), rangeBonus );
                    }
                    if (radioBow.isSelected()) {
                        Ranger playerChar = new Ranger( playerNameTfP2.getText(), bow, Integer.parseInt(strengthTfP2.getText()), Integer.parseInt(vitalityTfP2.getText()),Integer.parseInt(intelligenceTfP2.getText()), Integer.parseInt(dexterityTfP2.getText()), rangeBonus );
                        CharCheck.setText(playerChar.toString());
                    }

                }

                charCreator.setVisible(false);
                battleOutput.setVisible(true);

            }
        });

        statGenBnP2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                strengthTfP2.setText(randomGenerator());
                vitalityTfP2.setText(randomGenerator());
                intelligenceTfP2.setText(randomGenerator());
                dexterityTfP2.setText(randomGenerator());
                statGenBnP2.setText("RE-ROLL");
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
                wSpecialLbP2.setText("Attack Modifier");
                wAttackTfP2.setText("" + sword.getAttack());
                wWeightTfP2.setText("" + sword.getWeight());
                wSpecialTfP2.setText("" + sword.getAttackModifier());

            }
        });

        radioStaff.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Sound effectEquip = new Sound("Audio/Equip2.wav");
                picWeaponLbP2.setIcon(new ImageIcon(getClass().getResource("/Images/staff.png")));
                weaponDescription.setText(" THE STAFF\n A TWO HANDED STAFF. PERFECT FOR CHANNELING ARCANE\n POWER. HAS BONUS SPELL CHARGES.");
                effectEquip.playOnce();
                wSpecialLbP2.setText("SpellCharges");
                wAttackTfP2.setText("" + staff.getAttack());
                wWeightTfP2.setText("" + staff.getWeight());
                wSpecialTfP2.setText("" + staff.getSpellCharge());

            }
        });

        radioBow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Sound effectEquip = new Sound("Audio/Equip3.wav");
                picWeaponLbP2.setIcon(new ImageIcon(getClass().getResource("/Images/Bow2.png")));
                weaponDescription.setText(" THE BOW\n A BOW AND ARROWS. A RANGERS BEST FRIEND.\n HAS BONUS RANGE MODIFIER.");
                effectEquip.playOnce();
                wSpecialLbP2.setText("Range Modifier");
                wAttackTfP2.setText("" + bow.getAttack());
                wWeightTfP2.setText("" + bow.getWeight());
                wSpecialTfP2.setText("" + bow.getRangeModifier());

            }
        });





    }



}