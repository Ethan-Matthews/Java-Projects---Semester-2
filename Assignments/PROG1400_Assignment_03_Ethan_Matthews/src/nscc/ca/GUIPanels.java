package nscc.ca;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileNotFoundException;

public class GUIPanels extends JFrames {

    public int randomGenerator() {
        int number = (int)(Math.random()* 20 + 1);
        return number;
    }


    public Boolean inputCheck(String name, String stat, ButtonGroup classes, ButtonGroup weapons) {
        boolean acceptableInput = true;
        UIManager UI = new UIManager();
        UI.put("OptionPane.background", Color.BLACK);
        UI.put("Panel.background", Color.BLACK);
        UI.put("Button.background", Color.BLACK);
        UI.put("Button.foreground", Color.WHITE);

        JLabel message = new JLabel("  Please Enter a Name.");
        message.setBackground(Color.BLACK);
        message.setForeground(Color.WHITE);
        JButton button = new JButton("OK");
        button.setBackground(Color.BLACK);
        button.setForeground(Color.WHITE);

        if (name.isEmpty()) {
            JOptionPane.showMessageDialog(null, message, "Whoops", JOptionPane.ERROR_MESSAGE);
            acceptableInput = false;
        }
        else if (classes.getSelection()==null) {
            message.setText("Please Select a Class.");
            JOptionPane.showMessageDialog(null, message, "Whoops", JOptionPane.ERROR_MESSAGE);
            acceptableInput = false;
        }
        else if (weapons.getSelection()==null) {
            message.setText("Please Select a Weapon.");
            JOptionPane.showMessageDialog(null, message, "Whoops", JOptionPane.ERROR_MESSAGE);
            acceptableInput = false;
        }
        else if (stat.isEmpty()) {
            message.setText("Please Roll your characters Stats.");
            JOptionPane.showMessageDialog(null, message, "Whoops", JOptionPane.ERROR_MESSAGE);
            acceptableInput = false;
        }
        return acceptableInput;
    }


    public GUIPanels() {

        Sound BGM = new Sound("Audio/Theme1.wav");
        BGM.loopContinuously();

        int spellPower = 2;
        int healBonus = 3;
        int rangeBonus = 2;

        Staff staff = new Staff(25, 5, 2);
        Sword sword = new Sword(20, 30, 5);
        Bow bow = new Bow(10, 15, 10);

        Dragon dragon = new Dragon("Dragon", randomGenerator(), randomGenerator(), randomGenerator(), randomGenerator(), "Fire");
        Skeleton skeleton = new Skeleton("Skeleton", randomGenerator(), randomGenerator(), randomGenerator(), randomGenerator(), 1);
        Orc orc = new Orc("Orc", randomGenerator(), randomGenerator(), randomGenerator(), randomGenerator(), 10);




//------FIRST J PANEL SPLASH SCREEN--------------------------------------------


        JPanel contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(1, 1, 1, 1));
        setContentPane(contentPane);
        contentPane.setLayout(new CardLayout(0, 0));

        JPanels splashScreen = new JPanels();
        splashScreen.setLayout(null);
        contentPane.add(splashScreen);

        JLabels picLbP1 = new JLabels(92, 188, 816, 624, null, 0);
        try {
            picLbP1.setIcon(new ImageIcon(getClass().getResource("/Images/CrossedSwords.png")));
            splashScreen.add(picLbP1);
        } catch (Exception ex) { ex.printStackTrace();}

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

        JLabels titleLbP3 = new JLabels(15, 10, 960, 70, "BATTLE ONE", 48);
        titleLbP3.setHorizontalAlignment(JLabel.CENTER);
        battleOutput.add(titleLbP3);

        JLabels titleULbP3 = new JLabels(15, 80, 960, 1, null, 0);
        titleULbP3.setBackground(Color.WHITE);
        Border borderP3 = BorderFactory.createLineBorder(Color.WHITE, 10);
        titleULbP3.setBorder(borderP3);
        battleOutput.add(titleULbP3);

        JLabels classChoiceLbP3 = new JLabels(0, 150, 500, 40, null, 24);
        classChoiceLbP3.setHorizontalAlignment(JLabel.CENTER);
        battleOutput.add(classChoiceLbP3);

        JLabels monsterTypeLbP3 = new JLabels(500, 150, 500, 40, null, 24);
        monsterTypeLbP3.setHorizontalAlignment(JLabel.CENTER);
        battleOutput.add(monsterTypeLbP3);

        JLabels vs = new JLabels(450, 315, 100, 80, "VS", 72);
        battleOutput.add(vs);

        JLabels picClassLbP3 = new JLabels(65,200, 302,280, null, 0);
        battleOutput.add(picClassLbP3);

        JLabels picEnemyLbP3 = new JLabels(633,200, 302,280, null, 0);
        battleOutput.add(picEnemyLbP3);

        JTextAreas textOutTaP3 = new JTextAreas(15, 500, 963, 405, null, 18);
        battleOutput.add(textOutTaP3);

        JTextAreas textOutTa2P3 = new JTextAreas(15, 500, 963, 405, null, 18);
        textOutTa2P3.setVisible(false);
        battleOutput.add(textOutTa2P3);

        JTextAreas textOutTa3P3 = new JTextAreas(15, 500, 963, 405, null, 18);
        textOutTa3P3.setVisible(false);
        battleOutput.add(textOutTa3P3);

        JButtons nextBnP3 = new JButtons(440, 920, 120, 40, "NEXT", 24);
        battleOutput.add(nextBnP3);

        JButtons nextBn2P3 = new JButtons(440, 920, 120, 40, "NEXT", 24);
        nextBn2P3.setVisible(false);
        battleOutput.add(nextBn2P3);

        JButtons restartBnP3 = new JButtons(370, 920, 260, 40, "Roll Again?", 24);
        restartBnP3.setVisible(false);
        battleOutput.add(restartBnP3);


        //Splash screen Create button action listener.
        createBnP1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Sound effectGate = new Sound("Audio/Gate2.wav");
                    effectGate.playOnce();
                } catch (Exception ex){ ex.printStackTrace(); }
                splashScreen.setVisible(false);
                charCreator.setVisible(true);
            }
        });

        battleBnP2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (inputCheck(playerNameTfP2.getText(), strengthTfP2.getText(), charClasses, weaponClasses)) {
                    try {
                        picEnemyLbP3.setIcon(new ImageIcon(getClass().getResource("/Images/Orc.png")));
                    } catch (Exception ex){ ex.printStackTrace(); }
                    monsterTypeLbP3.setText("Monster: Orc");
                    if (radioMage.isSelected()) {
                        try {
                            picClassLbP3.setIcon(new ImageIcon(getClass().getResource("/Images/Mage.png")));
                        } catch (Exception ex){ ex.printStackTrace(); }
                        classChoiceLbP3.setText("Player: Mage");
                        if (radioSword.isSelected()) {
                            Mage playerChar = new Mage(playerNameTfP2.getText(), sword, Integer.parseInt(strengthTfP2.getText()), Integer.parseInt(vitalityTfP2.getText()), Integer.parseInt(intelligenceTfP2.getText()), Integer.parseInt(dexterityTfP2.getText()), spellPower);
                            textOutTaP3.setText(playerChar.toString());
                            textOutTa2P3.setText(playerChar.toString());
                            textOutTa3P3.setText(playerChar.toString());
                        }
                        if (radioStaff.isSelected()) {
                            Mage playerChar = new Mage(playerNameTfP2.getText(), staff, Integer.parseInt(strengthTfP2.getText()), Integer.parseInt(vitalityTfP2.getText()), Integer.parseInt(intelligenceTfP2.getText()), Integer.parseInt(dexterityTfP2.getText()), spellPower);
                            textOutTaP3.setText(playerChar.toString());
                            textOutTa2P3.setText(playerChar.toString());
                            textOutTa3P3.setText(playerChar.toString());
                        }
                        if (radioBow.isSelected()) {
                            Mage playerChar = new Mage(playerNameTfP2.getText(), bow, Integer.parseInt(strengthTfP2.getText()), Integer.parseInt(vitalityTfP2.getText()), Integer.parseInt(intelligenceTfP2.getText()), Integer.parseInt(dexterityTfP2.getText()), spellPower);
                            textOutTaP3.setText(playerChar.toString());
                            textOutTa2P3.setText(playerChar.toString());
                            textOutTa3P3.setText(playerChar.toString());
                        }
                    }

                    if (radioPaladin.isSelected()) {
                        try {
                            picClassLbP3.setIcon(new ImageIcon(getClass().getResource("/Images/Paladin.png")));
                        } catch (Exception ex){ ex.printStackTrace(); }
                        classChoiceLbP3.setText("Player: Paladin");
                        if (radioSword.isSelected()) {
                            Paladin playerChar = new Paladin(playerNameTfP2.getText(), sword, Integer.parseInt(strengthTfP2.getText()), Integer.parseInt(vitalityTfP2.getText()), Integer.parseInt(intelligenceTfP2.getText()), Integer.parseInt(dexterityTfP2.getText()), healBonus);
                            textOutTaP3.setText(playerChar.toString());
                            textOutTa2P3.setText(playerChar.toString());
                            textOutTa3P3.setText(playerChar.toString());
                        }
                        if (radioStaff.isSelected()) {
                            Paladin playerChar = new Paladin(playerNameTfP2.getText(), staff, Integer.parseInt(strengthTfP2.getText()), Integer.parseInt(vitalityTfP2.getText()), Integer.parseInt(intelligenceTfP2.getText()), Integer.parseInt(dexterityTfP2.getText()), healBonus);
                            textOutTaP3.setText(playerChar.toString());
                            textOutTa2P3.setText(playerChar.toString());
                            textOutTa3P3.setText(playerChar.toString());
                        }
                        if (radioBow.isSelected()) {
                            Paladin playerChar = new Paladin(playerNameTfP2.getText(), bow, Integer.parseInt(strengthTfP2.getText()), Integer.parseInt(vitalityTfP2.getText()), Integer.parseInt(intelligenceTfP2.getText()), Integer.parseInt(dexterityTfP2.getText()), healBonus);
                            textOutTaP3.setText(playerChar.toString());
                            textOutTa2P3.setText(playerChar.toString());
                            textOutTa3P3.setText(playerChar.toString());
                        }
                    }

                    if (radioRanger.isSelected()) {
                        try {
                            picClassLbP3.setIcon(new ImageIcon(getClass().getResource("/Images/Ranger.png")));
                        } catch (Exception ex){ ex.printStackTrace(); }
                        classChoiceLbP3.setText("Player: Ranger");
                        if (radioSword.isSelected()) {
                            Ranger playerChar = new Ranger(playerNameTfP2.getText(), sword, Integer.parseInt(strengthTfP2.getText()), Integer.parseInt(vitalityTfP2.getText()), Integer.parseInt(intelligenceTfP2.getText()), Integer.parseInt(dexterityTfP2.getText()), rangeBonus);
                            textOutTaP3.setText(playerChar.toString());
                            textOutTa2P3.setText(playerChar.toString());
                            textOutTa3P3.setText(playerChar.toString());
                        }
                        if (radioStaff.isSelected()) {
                            Ranger playerChar = new Ranger(playerNameTfP2.getText(), staff, Integer.parseInt(strengthTfP2.getText()), Integer.parseInt(vitalityTfP2.getText()), Integer.parseInt(intelligenceTfP2.getText()), Integer.parseInt(dexterityTfP2.getText()), rangeBonus);
                            textOutTaP3.setText(playerChar.toString());
                            textOutTa2P3.setText(playerChar.toString());
                            textOutTa3P3.setText(playerChar.toString());
                        }
                        if (radioBow.isSelected()) {
                            Ranger playerChar = new Ranger(playerNameTfP2.getText(), bow, Integer.parseInt(strengthTfP2.getText()), Integer.parseInt(vitalityTfP2.getText()), Integer.parseInt(intelligenceTfP2.getText()), Integer.parseInt(dexterityTfP2.getText()), rangeBonus);
                            textOutTaP3.setText(playerChar.toString());
                            textOutTa2P3.setText(playerChar.toString());
                            textOutTa3P3.setText(playerChar.toString());
                        }

                    }
                    textOutTaP3.append(orc.toString());
                    charCreator.setVisible(false);
                    battleOutput.setVisible(true);
                }
            }
        });

        statGenBnP2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                strengthTfP2.setText(Integer.toString(randomGenerator()));
                vitalityTfP2.setText(Integer.toString(randomGenerator()));
                intelligenceTfP2.setText(Integer.toString(randomGenerator()));
                dexterityTfP2.setText(Integer.toString(randomGenerator()));
                statGenBnP2.setText("RE-ROLL");
            }
        });

        nextBnP3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    picEnemyLbP3.setIcon(new ImageIcon(getClass().getResource("/Images/Skeleton_Warrior.png")));
                } catch (Exception ex){ ex.printStackTrace(); }
                titleLbP3.setText("BATTLE TWO");
                monsterTypeLbP3.setText("Monster: Skeleton");
                textOutTa2P3.append(skeleton.toString());
                nextBn2P3.setVisible(true);
                nextBnP3.setVisible(false);
                textOutTaP3.setVisible(false);
                textOutTa2P3.setVisible(true);

            }
        });

        nextBn2P3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    picEnemyLbP3.setIcon(new ImageIcon(getClass().getResource("/Images/Dragon.png")));
                } catch (Exception ex) { ex.printStackTrace(); }
                titleLbP3.setText("FINAL BATTLE");
                monsterTypeLbP3.setText("Monster: Dragon");
                textOutTa3P3.append(dragon.toString());
                nextBn2P3.setVisible(false);
                restartBnP3.setVisible(true);
                textOutTa2P3.setVisible(false);
                textOutTa3P3.setVisible(true);

            }
        });

        restartBnP3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                titleLbP3.setText("BATTLE ONE");
                statGenBnP2.setText("ROLL");
                nextBnP3.setVisible(true);
                textOutTaP3.setVisible(true);
                textOutTa2P3.setVisible(false);
                textOutTa3P3.setVisible(false);
                restartBnP3.setVisible(false);
                battleOutput.setVisible(false);
                splashScreen.setVisible(true);
                charClasses.clearSelection();
                weaponClasses.clearSelection();
                picClassLbP2.setIcon(null);
                picWeaponLbP2.setIcon(null);
                playerNameTfP2.setText(null);
                strengthTfP2.setText(null);
                vitalityTfP2.setText(null);
                intelligenceTfP2.setText(null);
                dexterityTfP2.setText(null);
                wAttackTfP2.setText(null);
                wWeightTfP2.setText(null);
                weaponDescription.setText(null);
                classDescription.setText(null);
                weaponLbP2.setText(null);
                wSpecialTfP2.setText(null);

            }
        });


        radioMage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try { Sound effectThunder = new Sound("Audio/Thunder10.wav");
                    effectThunder.playOnce();
                } catch (Exception ex) { ex.printStackTrace();}
                try {
                    picClassLbP2.setIcon(new ImageIcon(getClass().getResource("/Images/Mage.png")));
                } catch (Exception ex) { ex.printStackTrace();}
                classDescription.setText(" THE MAGE\n A MASTER OF THE ELEMENTS AND ARCANE ARTS. HIGH\n INTELLIGENCE AND DEXTERITY, LOW VITALITY AND STRENGTH.");


            }
        });

        radioPaladin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Sound effectSwords = new Sound("Audio/Sword6.wav");
                    effectSwords.playOnce();
                } catch (Exception ex) {ex.printStackTrace();}
                try {
                    picClassLbP2.setIcon(new ImageIcon(getClass().getResource("/Images/Paladin.png")));
                } catch (Exception ex) {ex.printStackTrace();}
                classDescription.setText(" THE PALADIN\n A HOLY WARRIOR BLESSED BY THE LIGHT. HIGH VITALITY AND\n STRENGTH, LOW INTELLIGENCE AND DEXTERITY.");

            }
        });

        radioRanger.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Sound effectBow = new Sound("Audio/Bow4.wav");
                    effectBow.playOnce();
                } catch (Exception ex) {ex.printStackTrace(); }
                try {
                    picClassLbP2.setIcon(new ImageIcon(getClass().getResource("/Images/Ranger.png")));
                } catch (Exception ex) {ex.printStackTrace(); }
                classDescription.setText(" THE RANGER\n SKILLED WITH THE USE OF LONG RANGE WEAPONS. HIGH\n DEXTERITY AND INTELLIGENCE, LOW STRENGTH AND VITALITY.");

            }
        });

        radioSword.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Sound effectEquip = new Sound("Audio/Equip1.wav");
                    effectEquip.playOnce();
                } catch (Exception ex) {ex.printStackTrace(); }
                try {
                    picWeaponLbP2.setIcon(new ImageIcon(getClass().getResource("/Images/sword_3.png")));
                } catch (Exception ex) {ex.printStackTrace(); }
                weaponDescription.setText(" THE SWORD\n A ONE HANDED BLADE. MOST BASIC OF MELEE WEAPONS.\n HAS BONUS ATTACK MODIFIER.");
                wSpecialLbP2.setText("Attack Modifier");
                wAttackTfP2.setText("" + sword.getAttack());
                wWeightTfP2.setText("" + sword.getWeight());
                wSpecialTfP2.setText("" + sword.getAttackModifier());

            }
        });

        radioStaff.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Sound effectEquip = new Sound("Audio/Equip2.wav");
                    effectEquip.playOnce();
                } catch (Exception ex) {ex.printStackTrace(); }
                try {
                    picWeaponLbP2.setIcon(new ImageIcon(getClass().getResource("/Images/staff.png")));
                } catch (Exception ex) {ex.printStackTrace(); }
                weaponDescription.setText(" THE STAFF\n A TWO HANDED STAFF. PERFECT FOR CHANNELING ARCANE\n POWER. HAS BONUS SPELL CHARGES.");
                wSpecialLbP2.setText("SpellCharges");
                wAttackTfP2.setText("" + staff.getAttack());
                wWeightTfP2.setText("" + staff.getWeight());
                wSpecialTfP2.setText("" + staff.getSpellCharge());

            }
        });

        radioBow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    try {
                        Sound effectEquip = new Sound("Audio/Equip3.wav");
                        effectEquip.playOnce();
                    } catch (Exception ex) {ex.printStackTrace(); }
                    try {
                        picWeaponLbP2.setIcon(new ImageIcon(getClass().getResource("/Images/Bow2.png")));
                    } catch (Exception ex) {ex.printStackTrace(); }
                weaponDescription.setText(" THE BOW\n A BOW AND ARROWS. A RANGERS BEST FRIEND.\n HAS BONUS RANGE MODIFIER.");
                wSpecialLbP2.setText("Range Modifier");
                wAttackTfP2.setText("" + bow.getAttack());
                wWeightTfP2.setText("" + bow.getWeight());
                wSpecialTfP2.setText("" + bow.getRangeModifier());

            }
        });


        }

    }