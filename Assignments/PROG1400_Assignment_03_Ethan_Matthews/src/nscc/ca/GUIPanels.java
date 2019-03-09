package nscc.ca;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class GUIPanels extends JFrames {
    //Method generates random number between 1 and 20.
    public int randomGenerator() {
        int number = (int)(Math.random()* 20 + 1);
        return number;
    }

    //Method checks if all fields have been filled/selected before object generation.
    public Boolean inputCheck(String name, String stat, ButtonGroup classes, ButtonGroup weapons) {
        //Set boolean to true every time method is run.
        boolean acceptableInput = true;
        //Creates sound object for error checking.
        Sound errorEffect = new Sound("Audio/Buzzer1.wav");
        //Sets colours for JOptionPanes.
        UIManager UI = new UIManager();
        UI.put("OptionPane.background", Color.BLACK);
        UI.put("Panel.background", Color.BLACK);
        UI.put("Button.background", Color.BLACK);
        UI.put("Button.foreground", Color.WHITE);
        //Creates new Label to pin to JOptionPanes.
        JLabel message = new JLabel("");
        message.setBackground(Color.BLACK);
        message.setForeground(Color.WHITE);
        JButton button = new JButton("OK");
        button.setBackground(Color.BLACK);
        button.setForeground(Color.WHITE);
        //Name input checking.
        if (name.isEmpty()) {
            //Play Buzzer effect once.
            errorEffect.playOnce();
            //Sets text of JOptionpane Label.
            message.setText("  Please Enter a Name.");
            //Displays JOptionpane to User.
            JOptionPane.showMessageDialog(null, message, "Whoops", JOptionPane.ERROR_MESSAGE);
            acceptableInput = false;
        }
        //Classes input checking.
        else if (classes.getSelection()==null) {
            //Play Buzzer effect once.
            errorEffect.playOnce();
            //Sets text of JOptionpane Label.
            message.setText("Please Select a Class.");
            //Displays JOptionpane to User.
            JOptionPane.showMessageDialog(null, message, "Whoops", JOptionPane.ERROR_MESSAGE);
            acceptableInput = false;
        }
        //Weapons input checking.
        else if (weapons.getSelection()==null) {
            //Play Buzzer effect once.
            errorEffect.playOnce();
            //Sets text of JOptionpane Label.
            message.setText("Please Select a Weapon.");
            //Displays JOptionpane to User.
            JOptionPane.showMessageDialog(null, message, "Whoops", JOptionPane.ERROR_MESSAGE);
            acceptableInput = false;
        }
        //Character stat input checking.
        else if (stat.isEmpty()) {
            //Play Buzzer effect once.
            errorEffect.playOnce();
            //Sets text of JOptionpane Label.
            message.setText("Please Roll your characters Stats.");
            //Displays JOptionpane to User.
            JOptionPane.showMessageDialog(null, message, "Whoops", JOptionPane.ERROR_MESSAGE);
            acceptableInput = false;
        }
        return acceptableInput;
    }


    public GUIPanels() {
        //Creates all sound objects for main panels.
        Sound restartEffect = new Sound("Audio/Applause1.wav");
        Sound nextEffect = new Sound("Audio/BattleStart.wav");
        Sound effectEquip1 = new Sound("Audio/Equip1.wav");
        Sound effectEquip2 = new Sound("Audio/Equip2.wav");
        Sound effectEquip3 = new Sound("Audio/Equip3.wav");
        Sound effectBow = new Sound("Audio/Bow4.wav");
        Sound effectSwords = new Sound("Audio/Sword6.wav");
        Sound effectThunder = new Sound("Audio/Thunder10.wav");
        Sound effectDice = new Sound("Audio/Roll_Dice.wav");
        Sound effectGate = new Sound("Audio/Gate2.wav");
        Sound battleBGM = new Sound("Audio/Battle5.wav");
        Sound BGM = new Sound("Audio/Theme1.wav");
        //Starts background music on continuous loop.
        BGM.loopContinuously();
        //pre-initialized character class object attributes.
        int spellPower = 2;
        int healBonus = 3;
        int rangeBonus = 2;
        //Creates new weapon objects that aggregate to character classes.
        Staff staff = new Staff(25, 5, 2);
        Sword sword = new Sword(20, 30, 5);
        Bow bow = new Bow(10, 15, 10);
        //Creates monsters, one of each type.
        Dragon dragon = new Dragon("Dragon", randomGenerator(), randomGenerator(), randomGenerator(), randomGenerator(), "Fire");
        Skeleton skeleton = new Skeleton("Skeleton", randomGenerator(), randomGenerator(), randomGenerator(), randomGenerator(), 1);
        Orc orc = new Orc("Orc", randomGenerator(), randomGenerator(), randomGenerator(), randomGenerator(), 10);




//------FIRST J PANEL SPLASH SCREEN--------------------------------------------

        //JPanel for content pane.
        JPanel contentPane = new JPanel();
        //Sets the window border width for the content pane.
        contentPane.setBorder(new EmptyBorder(1, 1, 1, 1));
        setContentPane(contentPane);
        //Sets Card layout for all panels.
        contentPane.setLayout(new CardLayout(0, 0));
        //JPanel for splash screen
        JPanels splashScreen = new JPanels();
        splashScreen.setLayout(null);
        contentPane.add(splashScreen);
        //Creates JLabel for splash screen Image.
        JLabels picLbP1 = new JLabels(92, 188, 816, 624, null, 0);
        //Adds splash screen image to Label.
        try {
            picLbP1.setIcon(new ImageIcon(getClass().getResource("/Images/CrossedSwords.png")));
            splashScreen.add(picLbP1);
        } catch (Exception ex) { ex.printStackTrace();}
        //JLabel for main title.
        JLabels titleLbP1 = new JLabels(0,0,1000,188, "FOOLS QUEST", 72);
        titleLbP1.setHorizontalAlignment(JLabel.CENTER);
        splashScreen.add(titleLbP1);
        //JButton for continuing to char creation.
        JButtons createBnP1 = new JButtons(250,850,500,75,"Create Character", 36);
        splashScreen.add(createBnP1);


//------SECOND J PANEL CHARACTER GENERATOR--------------------------------------

        //JPanel for character creation.
        JPanels charCreator = new JPanels();
        charCreator.setLayout(null);
        contentPane.add(charCreator);

        //JLabel for main title of character creation.
        JLabels titleLbP2 = new JLabels(15, 10, 960, 70, "CHARACTER GENERATION", 48);
        titleLbP2.setHorizontalAlignment(JButton.LEFT);
        charCreator.add(titleLbP2);
        //JLabel for title text underline.
        JLabels titleULbP2 = new JLabels(15, 80, 960, 1, null, 0);
        titleULbP2.setBackground(Color.WHITE);
        Border border5 = BorderFactory.createLineBorder(Color.WHITE, 10);
        titleULbP2.setBorder(border5);
        charCreator.add(titleULbP2);
        //JLabel for player name.
        JLabels enterNameLbP2 = new JLabels(15, 100, 180, 75, "ENTER NAME:", 24);
        charCreator.add(enterNameLbP2);
        //JLabel for Character Class.
        JLabels CharTypeLbP2 = new JLabels(15, 175, 250, 50, "CHARACTER CLASS", 24);
        charCreator.add(CharTypeLbP2);
        //JLabel for Character stats.
        JLabels charStatsLbP2 = new JLabels(600, 175, 280, 50, "CHARACTER STATS", 24);
        charCreator.add(charStatsLbP2);
        //JLabel for weapon types.
        JLabels weaponLbP2 = new JLabels(15, 640, 250, 50, "WEAPON TYPE", 24);
        charCreator.add(weaponLbP2);
        //JLabel for weapon stats.
        JLabels weaponStatsLbP2 = new JLabels(600, 640, 250, 50, "WEAPON STATS", 24);
        charCreator.add(weaponStatsLbP2);
        //JLabel for Str.
        JLabels strengthLbP2 = new JLabels(600, 255, 150, 30, "Strength", 20);
        charCreator.add(strengthLbP2);
        //JLabel for vit.
        JLabels vitalityLbP2 = new JLabels(600, 305, 280, 30, "Vitality", 20);
        charCreator.add(vitalityLbP2);
        //JLabel for int.
        JLabels intelligenceLbP2 = new JLabels(600, 355, 280, 30, "Intelligence", 20);
        charCreator.add(intelligenceLbP2);
        //JLabel for dex.
        JLabels dexterityLbP2 = new JLabels(600, 405, 280, 30, "Dexterity", 20);
        charCreator.add(dexterityLbP2);
        //JLabel for weapon attack.
        JLabels wAttackLbP2 = new JLabels(600, 690, 280, 30, "Attack", 20);
        charCreator.add(wAttackLbP2);
        //JLabel for weapon weight.
        JLabels wWeightLbP2 = new JLabels(600, 740, 280, 30, "Weight", 20);
        charCreator.add(wWeightLbP2);
        //JLabel for weapon special.
        JLabels wSpecialLbP2 = new JLabels(600, 790, 280, 30, "Special", 20);
        charCreator.add(wSpecialLbP2);
        //JLabel for class pictures.
        JLabels picClassLbP2 = new JLabels(275, 225, 302, 280, null, 0);
        charCreator.add(picClassLbP2);
        //JLabel for weapon pictures.
        JLabels picWeaponLbP2 = new JLabels(325, 690, 250, 130, null, 0);
        charCreator.add(picWeaponLbP2);


        //JText Field for Player name.
        JTextFields playerNameTfP2 = new JTextFields(215, 110, 180, 40, null, 24);
        //Sets so user can enter name.
        playerNameTfP2.setEditable(true);
        //Doesn't start highlighted.
        playerNameTfP2.setHighlighter(null);
        charCreator.add(playerNameTfP2);
        //JText Field for str.
        JTextFields strengthTfP2 = new JTextFields(850, 255, 35, 30, null, 16);
        charCreator.add(strengthTfP2);
        //JText Field for vit.
        JTextFields vitalityTfP2 = new JTextFields(850, 305, 35, 30, null, 16);
        charCreator.add(vitalityTfP2);
        //JText Field for int.
        JTextFields intelligenceTfP2 = new JTextFields(850, 355, 35, 30, null, 16);
        charCreator.add(intelligenceTfP2);
        //JText Field for dex.
        JTextFields dexterityTfP2 = new JTextFields(850, 405, 35, 30, null, 16);
        charCreator.add(dexterityTfP2);
        //JText Field for weapon attack.
        JTextFields wAttackTfP2 = new JTextFields(850, 690, 35, 30, null, 16);
        charCreator.add(wAttackTfP2);
        //JText Field for weapon weight.
        JTextFields wWeightTfP2 = new JTextFields(850, 740, 35, 30, null, 16);
        charCreator.add(wWeightTfP2);
        //JText Field for weapon special.
        JTextFields wSpecialTfP2 = new JTextFields(850, 790, 35, 30, null, 16);
        charCreator.add(wSpecialTfP2);


        //JButton for stat generation.
        JButtons statGenBnP2 = new JButtons(720, 475, 125, 40, "ROLL", 24);
        charCreator.add(statGenBnP2);
        //JButton for continuing to battle panel
        JButtons battleBnP2 = new JButtons(660, 860, 250, 40,"START BATTLE",24);
        charCreator.add(battleBnP2);


        //JText Area for class description.
        JTextAreas classDescription = new JTextAreas(15, 515, 562, 110, null, 16);
        charCreator.add(classDescription);
        //JText Area for weapon description.
        JTextAreas weaponDescription = new JTextAreas(15, 845, 562, 110, null, 16);
        charCreator.add(weaponDescription);


        //JRadio Buttons for character classes.
        JRadioButtons radioMage = new JRadioButtons(35, 255, 150, 50," Mage", 20);
        charCreator.add(radioMage);

        JRadioButtons radioPaladin = new JRadioButtons(35, 325, 150, 50, " Paladin", 20);
        charCreator.add(radioPaladin);

        JRadioButtons radioRanger = new JRadioButtons(35, 395, 150, 50, " Ranger", 20);
        charCreator.add(radioRanger);

        //JRadio buttons for weapons.
        JRadioButtons radioSword = new JRadioButtons(35, 690, 120, 30, " Sword", 20);
        charCreator.add(radioSword);

        JRadioButtons radioStaff = new JRadioButtons(35, 740, 120, 30, " Staff", 20);
        charCreator.add(radioStaff);

        JRadioButtons radioBow = new JRadioButtons(35, 790, 120, 30, " Bow", 20);
        charCreator.add(radioBow);

        //Button group for character classes.
        ButtonGroup charClasses = new ButtonGroup();
        charClasses.add(radioMage);
        charClasses.add(radioPaladin);
        charClasses.add(radioRanger);
        //Button group for weapon types.
        ButtonGroup weaponClasses = new ButtonGroup();
        weaponClasses.add(radioSword);
        weaponClasses.add(radioStaff);
        weaponClasses.add(radioBow);

//------THIRD J PANEL BATTLE OUTPUT--------------------------------------

        //JPanel for battle screen.
        JPanels battleOutput = new JPanels();
        charCreator.setLayout(null);
        contentPane.add(battleOutput);
        //JLabel for main title.
        JLabels titleLbP3 = new JLabels(15, 10, 960, 70, "BATTLE ONE", 48);
        titleLbP3.setHorizontalAlignment(JLabel.CENTER);
        battleOutput.add(titleLbP3);
        //JLabel for main title underline.
        JLabels titleULbP3 = new JLabels(15, 80, 960, 1, null, 0);
        titleULbP3.setBackground(Color.WHITE);
        Border borderP3 = BorderFactory.createLineBorder(Color.WHITE, 10);
        titleULbP3.setBorder(borderP3);
        battleOutput.add(titleULbP3);
        //JLabel for class chosen by user.
        JLabels classChoiceLbP3 = new JLabels(0, 150, 500, 40, null, 24);
        classChoiceLbP3.setHorizontalAlignment(JLabel.CENTER);
        battleOutput.add(classChoiceLbP3);
        //JLabel for monster class.
        JLabels monsterTypeLbP3 = new JLabels(500, 150, 500, 40, null, 24);
        monsterTypeLbP3.setHorizontalAlignment(JLabel.CENTER);
        battleOutput.add(monsterTypeLbP3);
        //VS JLabel.
        JLabels vs = new JLabels(450, 315, 100, 80, "VS", 72);
        battleOutput.add(vs);
        //JLabel for char class pic.
        JLabels picClassLbP3 = new JLabels(65,200, 302,280, null, 0);
        battleOutput.add(picClassLbP3);
        //JLabel for monster pic.
        JLabels picEnemyLbP3 = new JLabels(633,200, 302,280, null, 0);
        battleOutput.add(picEnemyLbP3);
        //Text area for first output.
        JTextAreas textOutTaP3 = new JTextAreas(15, 500, 963, 405, null, 18);
        battleOutput.add(textOutTaP3);
        //Text area for second output.
        JTextAreas textOutTa2P3 = new JTextAreas(15, 500, 963, 405, null, 18);
        textOutTa2P3.setVisible(false);
        battleOutput.add(textOutTa2P3);
        //Text area for third output.
        JTextAreas textOutTa3P3 = new JTextAreas(15, 500, 963, 405, null, 18);
        textOutTa3P3.setVisible(false);
        battleOutput.add(textOutTa3P3);
        //JButton for battle panel 1 to battle panel 2.
        JButtons nextBnP3 = new JButtons(440, 920, 120, 40, "NEXT", 24);
        battleOutput.add(nextBnP3);
        //JButton for battle panel 2 to battle panel 3.
        JButtons nextBn2P3 = new JButtons(440, 920, 120, 40, "NEXT", 24);
        nextBn2P3.setVisible(false);
        battleOutput.add(nextBn2P3);
        //JButton for resetting char generator.
        JButtons restartBnP3 = new JButtons(370, 920, 260, 40, "Roll Again?", 24);
        restartBnP3.setVisible(false);
        battleOutput.add(restartBnP3);


        //Splash screen Create button action listener.
        createBnP1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                effectGate.playOnce();
                splashScreen.setVisible(false);
                charCreator.setVisible(true);
            }
        });
        //Battle button action listener main panel 2 to 3.
        battleBnP2.addActionListener(new ActionListener() {
            @Override
            public  void actionPerformed(ActionEvent e) {
                //Checks inputs of all need values.
                if (inputCheck(playerNameTfP2.getText(), strengthTfP2.getText(), charClasses, weaponClasses)) {
                    //stops background music.
                    BGM.stopSound();
                    nextEffect.playOnce();
                    //resets battle BGM to frame 0.
                    battleBGM.reset();
                    //starts battle BGM on continuous loop.
                    battleBGM.loopContinuously();
                    //Sets enemy picture.
                    try {
                        picEnemyLbP3.setIcon(new ImageIcon(getClass().getResource("/Images/Orc.png")));
                    } catch (Exception ex){ ex.printStackTrace(); }
                    //Sets enemy tile.
                    monsterTypeLbP3.setText("Monster: Orc");
                    //If statements for character generation.
                    if (radioMage.isSelected()) {
                        //Sets image to Mage on battle screen.
                        try {
                            picClassLbP3.setIcon(new ImageIcon(getClass().getResource("/Images/Mage.png")));
                        } catch (Exception ex){ ex.printStackTrace(); }
                        //Sets player class title if mage is selected.
                        classChoiceLbP3.setText("Player: Mage");
                        if (radioSword.isSelected()) {
                            //Creates new mage class with sword.
                            Mage playerChar = new Mage(playerNameTfP2.getText(), sword, Integer.parseInt(strengthTfP2.getText()), Integer.parseInt(vitalityTfP2.getText()), Integer.parseInt(intelligenceTfP2.getText()), Integer.parseInt(dexterityTfP2.getText()), spellPower);
                            //Adds text from Mage class toString to text output in battle panel 1.
                            textOutTaP3.setText(playerChar.toString());
                            //Adds text from Mage class toString to text output in battle panel 2.
                            textOutTa2P3.setText(playerChar.toString());
                            //Adds text from Mage class toString to text output in battle panel 3.
                            textOutTa3P3.setText(playerChar.toString());
                        }
                        if (radioStaff.isSelected()) {
                            //Creates new mage class with staff.
                            Mage playerChar = new Mage(playerNameTfP2.getText(), staff, Integer.parseInt(strengthTfP2.getText()), Integer.parseInt(vitalityTfP2.getText()), Integer.parseInt(intelligenceTfP2.getText()), Integer.parseInt(dexterityTfP2.getText()), spellPower);
                            textOutTaP3.setText(playerChar.toString());
                            textOutTa2P3.setText(playerChar.toString());
                            textOutTa3P3.setText(playerChar.toString());
                        }
                        if (radioBow.isSelected()) {
                            //Creates new mage class with bow.
                            Mage playerChar = new Mage(playerNameTfP2.getText(), bow, Integer.parseInt(strengthTfP2.getText()), Integer.parseInt(vitalityTfP2.getText()), Integer.parseInt(intelligenceTfP2.getText()), Integer.parseInt(dexterityTfP2.getText()), spellPower);
                            textOutTaP3.setText(playerChar.toString());
                            textOutTa2P3.setText(playerChar.toString());
                            textOutTa3P3.setText(playerChar.toString());
                        }
                    }

                    if (radioPaladin.isSelected()) {
                        //Sets image to Paladin on battle screen.
                        try {
                            picClassLbP3.setIcon(new ImageIcon(getClass().getResource("/Images/Paladin.png")));
                        } catch (Exception ex){ ex.printStackTrace(); }
                        //Sets player class title if Paladin is selected.
                        classChoiceLbP3.setText("Player: Paladin");
                        //Creates new Paladin class with sword.
                        if (radioSword.isSelected()) {
                            Paladin playerChar = new Paladin(playerNameTfP2.getText(), sword, Integer.parseInt(strengthTfP2.getText()), Integer.parseInt(vitalityTfP2.getText()), Integer.parseInt(intelligenceTfP2.getText()), Integer.parseInt(dexterityTfP2.getText()), healBonus);
                            //Adds text from Paladin class toString to text output in battle panel 1.
                            textOutTaP3.setText(playerChar.toString());
                            //Adds text from Paladin class toString to text output in battle panel 2.
                            textOutTa2P3.setText(playerChar.toString());
                            //Adds text from Paladin class toString to text output in battle panel 3.
                            textOutTa3P3.setText(playerChar.toString());
                        }
                        if (radioStaff.isSelected()) {
                            //Creates new Paladin class with staff.
                            Paladin playerChar = new Paladin(playerNameTfP2.getText(), staff, Integer.parseInt(strengthTfP2.getText()), Integer.parseInt(vitalityTfP2.getText()), Integer.parseInt(intelligenceTfP2.getText()), Integer.parseInt(dexterityTfP2.getText()), healBonus);
                            textOutTaP3.setText(playerChar.toString());
                            textOutTa2P3.setText(playerChar.toString());
                            textOutTa3P3.setText(playerChar.toString());
                        }
                        if (radioBow.isSelected()) {
                            //Creates new Paladin class with Bow.
                            Paladin playerChar = new Paladin(playerNameTfP2.getText(), bow, Integer.parseInt(strengthTfP2.getText()), Integer.parseInt(vitalityTfP2.getText()), Integer.parseInt(intelligenceTfP2.getText()), Integer.parseInt(dexterityTfP2.getText()), healBonus);
                            textOutTaP3.setText(playerChar.toString());
                            textOutTa2P3.setText(playerChar.toString());
                            textOutTa3P3.setText(playerChar.toString());
                        }
                    }

                    if (radioRanger.isSelected()) {
                        //Sets image to Ranger on battle screen.
                        try {
                            picClassLbP3.setIcon(new ImageIcon(getClass().getResource("/Images/Ranger.png")));
                        } catch (Exception ex){ ex.printStackTrace(); }
                        //Sets player class title if Ranger is selected.
                        classChoiceLbP3.setText("Player: Ranger");
                        //Creates new Ranger class with sword.
                        if (radioSword.isSelected()) {
                            Ranger playerChar = new Ranger(playerNameTfP2.getText(), sword, Integer.parseInt(strengthTfP2.getText()), Integer.parseInt(vitalityTfP2.getText()), Integer.parseInt(intelligenceTfP2.getText()), Integer.parseInt(dexterityTfP2.getText()), rangeBonus);
                            //Adds text from Paladin class toString to text output in battle panel 1.
                            textOutTaP3.setText(playerChar.toString());
                            //Adds text from Paladin class toString to text output in battle panel 2.
                            textOutTa2P3.setText(playerChar.toString());
                            //Adds text from Paladin class toString to text output in battle panel 3.
                            textOutTa3P3.setText(playerChar.toString());
                        }
                        if (radioStaff.isSelected()) {
                            //Creates new Ranger class with staff.
                            Ranger playerChar = new Ranger(playerNameTfP2.getText(), staff, Integer.parseInt(strengthTfP2.getText()), Integer.parseInt(vitalityTfP2.getText()), Integer.parseInt(intelligenceTfP2.getText()), Integer.parseInt(dexterityTfP2.getText()), rangeBonus);
                            textOutTaP3.setText(playerChar.toString());
                            textOutTa2P3.setText(playerChar.toString());
                            textOutTa3P3.setText(playerChar.toString());
                        }
                        if (radioBow.isSelected()) {
                            //Creates new Ranger class with bow.
                            Ranger playerChar = new Ranger(playerNameTfP2.getText(), bow, Integer.parseInt(strengthTfP2.getText()), Integer.parseInt(vitalityTfP2.getText()), Integer.parseInt(intelligenceTfP2.getText()), Integer.parseInt(dexterityTfP2.getText()), rangeBonus);
                            textOutTaP3.setText(playerChar.toString());
                            textOutTa2P3.setText(playerChar.toString());
                            textOutTa3P3.setText(playerChar.toString());
                        }

                    }
                    //Addends Text area output with Orc toString.
                    textOutTaP3.append(orc.toString());
                    //Char screen set to invisible.
                    charCreator.setVisible(false);
                    //Battle screen set to visible.
                    battleOutput.setVisible(true);
                }
            }
        });

        //JButton for Character Stat Generation.
        statGenBnP2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Plays Dice sound.
                effectDice.playOnce();
                //Sets and converts random integers to string.
                strengthTfP2.setText(Integer.toString(randomGenerator()));
                vitalityTfP2.setText(Integer.toString(randomGenerator()));
                intelligenceTfP2.setText(Integer.toString(randomGenerator()));
                dexterityTfP2.setText(Integer.toString(randomGenerator()));
                //Sets text to re-roll once activated.
                statGenBnP2.setText("RE-ROLL");
            }
        });
        //JButton next battle panels 1 to 2 action listener.
        nextBnP3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nextEffect.playOnce();
                //Sets new enemy picture.
                try {
                    picEnemyLbP3.setIcon(new ImageIcon(getClass().getResource("/Images/Skeleton_Warrior.png")));
                } catch (Exception ex){ ex.printStackTrace(); }
                //Changes Title.
                titleLbP3.setText("BATTLE TWO");
                //New monster type.
                monsterTypeLbP3.setText("Monster: Skeleton");
                //Appends skeleton toString to output text area.
                textOutTa2P3.append(skeleton.toString());
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
                nextEffect.playOnce();
                //Sets new enemy picture.
                try {
                    picEnemyLbP3.setIcon(new ImageIcon(getClass().getResource("/Images/Dragon.png")));
                } catch (Exception ex) { ex.printStackTrace(); }
                //Changes Title.
                titleLbP3.setText("FINAL BATTLE");
                //New monster type.
                monsterTypeLbP3.setText("Monster: Dragon");
                textOutTa3P3.append(dragon.toString());
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
                restartEffect.playOnce();
                //stops battle BGM.
                battleBGM.stopSound();
                //Resets BGM to frame 0.
                BGM.reset();
                //Starts BGM in continuous loop.
                BGM.loopContinuously();
                //Resets Tile on battle panel one.
                titleLbP3.setText("BATTLE ONE");
                //resets text of character stat button.
                statGenBnP2.setText("ROLL");
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
                battleOutput.setVisible(false);
                //Sets splash screen visible.
                splashScreen.setVisible(true);
                //Clears char class selection.
                charClasses.clearSelection();
                //Clears weapon type selection.
                weaponClasses.clearSelection();
                //Clears character pic.
                picClassLbP2.setIcon(null);
                //Clears weapon pic.
                picWeaponLbP2.setIcon(null);
                //Clears player name.
                playerNameTfP2.setText(null);
                //Clears all text in player stat text fields.
                strengthTfP2.setText(null);
                vitalityTfP2.setText(null);
                intelligenceTfP2.setText(null);
                dexterityTfP2.setText(null);
                //Clears all text in weapon stat text fields.
                wAttackTfP2.setText(null);
                wWeightTfP2.setText(null);
                wSpecialTfP2.setText(null);
                //Clears all text in weapon description text areas.
                weaponDescription.setText(null);
                //Clears all text in class description text areas.
                classDescription.setText(null);
                //Clears weapon label.
                weaponLbP2.setText(null);


            }
        });


        radioMage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                effectThunder.playOnce();
                try {
                    picClassLbP2.setIcon(new ImageIcon(getClass().getResource("/Images/Mage.png")));
                } catch (Exception ex) { ex.printStackTrace();}
                classDescription.setText(" THE MAGE\n A MASTER OF THE ELEMENTS AND ARCANE ARTS. HIGH\n INTELLIGENCE AND DEXTERITY, LOW VITALITY AND STRENGTH.");


            }
        });

        radioPaladin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                effectSwords.playOnce();
                try {
                    picClassLbP2.setIcon(new ImageIcon(getClass().getResource("/Images/Paladin.png")));
                } catch (Exception ex) {ex.printStackTrace();}
                classDescription.setText(" THE PALADIN\n A HOLY WARRIOR BLESSED BY THE LIGHT. HIGH VITALITY AND\n STRENGTH, LOW INTELLIGENCE AND DEXTERITY.");

            }
        });

        radioRanger.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                effectBow.playOnce();
                try {
                    picClassLbP2.setIcon(new ImageIcon(getClass().getResource("/Images/Ranger.png")));
                } catch (Exception ex) {ex.printStackTrace(); }
                classDescription.setText(" THE RANGER\n SKILLED WITH THE USE OF LONG RANGE WEAPONS. HIGH\n DEXTERITY AND INTELLIGENCE, LOW STRENGTH AND VITALITY.");

            }
        });

        radioSword.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                effectEquip1.playOnce();
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
                effectEquip2.playOnce();
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
                effectEquip3.playOnce();
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