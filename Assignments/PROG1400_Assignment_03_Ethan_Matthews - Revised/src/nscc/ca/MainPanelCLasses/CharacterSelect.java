package nscc.ca.MainPanelCLasses;

import nscc.ca.JavaSwingClasses.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import static nscc.ca.MainPanelCLasses.BattleOutput.*;
import static nscc.ca.JavaSwingClasses.JFrames.*;

public class CharacterSelect extends JPanels {

    private static JLabels picClassLbP2;
    private static JLabels picWeaponLbP2;
    private static JLabels wSpecialLbP2;

    private static JTextFields playerNameTfP2;
    private static JTextFields strengthTfP2;
    private static JTextFields vitalityTfP2;
    private static JTextFields intelligenceTfP2;
    private static JTextFields dexterityTfP2;
    private static JTextFields wAttackTfP2;
    private static JTextFields wWeightTfP2;
    private static JTextFields wSpecialTfP2;
    private static JTextFields attackTfP2;
    private static JTextFields hitPointsTfP2;
    private static JTextFields magicPointsTfP2;
    private static JTextFields attackRangeTfP2;
    private static JTextFields defenceTfP2;
    private static JTextFields hitTfP2;
    private static JTextFields mAttackTfP2;
    private static JTextFields mDefenceTfP2;
    private static JTextFields weightTfP2;

    private static JButton statGenBnP2;

    private static JTextAreas classDescription;
    private static JTextAreas weaponDescription;

    private static ButtonGroup charClasses;
    private static ButtonGroup weaponClasses;

    private static JRadioButtons radioMage;
    private static JRadioButtons radioPaladin;
    private static JRadioButtons radioRanger;
    private static JRadioButtons radioSword;
    private static JRadioButtons radioStaff;
    private static JRadioButtons radioBow;

    public CharacterSelect() {
        setVisible(false);
        //JLabel for main title of character creation.
        JLabels titleLbP2 = new JLabels(15, 10, 960, 70, "CHARACTER GENERATION", 48);
        titleLbP2.setHorizontalAlignment(JButton.LEFT);
        add(titleLbP2);
        //JLabel for title text underline.
        JLabels titleULbP2 = new JLabels(15, 80, 960, 1, null, 0);
        titleULbP2.setBackground(Color.WHITE);
        Border border5 = BorderFactory.createLineBorder(Color.WHITE, 10);
        titleULbP2.setBorder(border5);
        add(titleULbP2);
        //JLabel for player name.
        JLabels enterNameLbP2 = new JLabels(15, 100, 180, 75, "ENTER NAME:", 24);
        add(enterNameLbP2);
        //JLabel for Character Class.
        JLabels CharTypeLbP2 = new JLabels(15, 175, 250, 50, "CHARACTER CLASS", 24);
        add(CharTypeLbP2);
        //JLabel for Character stats.
        JLabels charStatsLbP2 = new JLabels(800, 175, 280, 50, "CHARACTER STATS", 24);
        add(charStatsLbP2);
        //JLabel for weapon types.
        JLabels weaponLbP2 = new JLabels(15, 640, 250, 50, "WEAPON TYPE", 24);
        add(weaponLbP2);
        //JLabel for weapon stats.
        JLabels weaponStatsLbP2 = new JLabels(600, 640, 250, 50, "WEAPON STATS", 24);
        add(weaponStatsLbP2);
        //JLabel for Str.
        JLabels strengthLbP2 = new JLabels(600, 255, 150, 30, "Strength", 20);
        add(strengthLbP2);
        //JLabel for vit.
        JLabels vitalityLbP2 = new JLabels(600, 305, 280, 30, "Vitality", 20);
        add(vitalityLbP2);
        //JLabel for int.
        JLabels intelligenceLbP2 = new JLabels(600, 355, 280, 30, "Intelligence", 20);
        add(intelligenceLbP2);
        //JLabel for dex.
        JLabels dexterityLbP2 = new JLabels(600, 405, 280, 30, "Dexterity", 20);
        add(dexterityLbP2);
//--------------------------------
        JLabels attackLbP2 = new JLabels(940, 255, 150, 30, "Attack", 20);
        add(attackLbP2);

        JLabels defenceLbP2 = new JLabels(940, 305, 150, 30, "Defence", 20);
        add(defenceLbP2);

        JLabels hitPointsLbP2 = new JLabels(940, 355, 150, 30, "Hit Points", 20);
        add(hitPointsLbP2);

        JLabels magicPointsLbP2 = new JLabels(940, 405, 150, 30, "Magic Points", 20);
        add(magicPointsLbP2);

        JLabels attackRangeLbP2 = new JLabels(940, 455, 180, 30, "Attack Range", 20);
        add(attackRangeLbP2);

        JLabels hitLbP2 = new JLabels(940, 505, 180, 30, "Hit", 20);
        add(hitLbP2);

        JLabels mAttackLbP2 = new JLabels(940, 555, 180, 30, "Magic Attack", 20);
        add(mAttackLbP2);

        JLabels mDefenceLbP2 = new JLabels(940, 605, 180, 30, "Magic Defence", 20);
        add(mDefenceLbP2);

        JLabels weightLbP2 = new JLabels(940, 655, 180, 30, "Weight Limit", 20);
        add(weightLbP2);

        //JLabel for weapon attack.
        JLabels wAttackLbP2 = new JLabels(600, 690, 280, 30, "Attack", 20);
        add(wAttackLbP2);
        //JLabel for weapon weight.
        JLabels wWeightLbP2 = new JLabels(600, 740, 280, 30, "Weight", 20);
        add(wWeightLbP2);
        //JLabel for weapon special.
        wSpecialLbP2 = new JLabels(600, 790, 280, 30, "Special", 20);
        add(wSpecialLbP2);
        //JLabel for class pictures.
        picClassLbP2 = new JLabels(275, 225, 302, 280, null, 0);
        try {
            picClassLbP2.setIcon(new ImageIcon(getClass().getResource("/Images/silhouetteClass.png")));
            add(picClassLbP2);
        } catch (Exception ex) { ex.printStackTrace();}
        //JLabel for weapon pictures.
        picWeaponLbP2 = new JLabels(325, 690, 250, 130, null, 0);
        try {
            picWeaponLbP2.setIcon(new ImageIcon(getClass().getResource("/Images/silhouetteWeapon.png")));
            add(picWeaponLbP2);
        } catch (Exception ex) { ex.printStackTrace();}
    
        //JText Field for Player name.
        playerNameTfP2 = new JTextFields(215, 110, 180, 40, null, 24);
        //Sets so user can enter name.
        playerNameTfP2.setEditable(true);
        //Doesn't start highlighted.
        playerNameTfP2.setHighlighter(null);
        add(playerNameTfP2);
        //JText Field for str.
        strengthTfP2 = new JTextFields(850, 255, 35, 30, null, 16);
        add(strengthTfP2);
        //JText Field for vit.
        vitalityTfP2 = new JTextFields(850, 305, 35, 30, null, 16);
        add(vitalityTfP2);
        //JText Field for int.
        intelligenceTfP2 = new JTextFields(850, 355, 35, 30, null, 16);
        add(intelligenceTfP2);
        //JText Field for dex.
        dexterityTfP2 = new JTextFields(850, 405, 35, 30, null, 16);
        add(dexterityTfP2);
        //JText Field for weapon attack.
        wAttackTfP2 = new JTextFields(850, 690, 35, 30, null, 16);
        add(wAttackTfP2);
        //JText Field for weapon weight.
        wWeightTfP2 = new JTextFields(850, 740, 35, 30, null, 16);
        add(wWeightTfP2);
        //JText Field for weapon special.
        wSpecialTfP2 = new JTextFields(850, 790, 35, 30, null, 16);
        add(wSpecialTfP2);
//----------------------
        attackTfP2 = new JTextFields(1190, 255, 35, 30, null, 16);
        add(attackTfP2);

        defenceTfP2 = new JTextFields(1190, 305, 35, 30, null, 16);
        add(defenceTfP2);

        hitPointsTfP2 = new JTextFields(1190, 355, 35, 30, null, 16);
        add(hitPointsTfP2);

        magicPointsTfP2 = new JTextFields(1190, 405, 35, 30, null, 16);
        add(magicPointsTfP2);

        attackRangeTfP2 = new JTextFields(1190, 455, 35, 30, null, 16);
        add(attackRangeTfP2);

        hitTfP2 = new JTextFields(1190, 505, 35, 30, null, 16);
        add(hitTfP2);

        mAttackTfP2 = new JTextFields(1190, 555, 35, 30, null, 16);
        add(mAttackTfP2);

        mDefenceTfP2 = new JTextFields(1190, 605, 35, 30, null, 16);
        add(mDefenceTfP2);

        weightTfP2 = new JTextFields(1190, 655, 35, 30, null, 16);
        add(weightTfP2);
    
        //JButton for stat generation.
        statGenBnP2 = new JButtons(720, 475, 125, 40, "ROLL", 24);
        add(statGenBnP2);
        //JButton for continuing to battle panel
        JButtons battleBnP2 = new JButtons(660, 860, 250, 40,"START BATTLE",24);
        add(battleBnP2);
    
        //JText Area for class description.
        classDescription = new JTextAreas(15, 515, 562, 110, null, 16);
        add(classDescription);
        //JText Area for weapon description.
        weaponDescription = new JTextAreas(15, 845, 562, 110, null, 16);
        add(weaponDescription);
    
        //JRadio Buttons for character classes.
        radioMage = new JRadioButtons(35, 255, 150, 50," Mage", 20);
        add(radioMage);
        radioPaladin = new JRadioButtons(35, 325, 150, 50, " Paladin", 20);
        add(radioPaladin);
        radioRanger = new JRadioButtons(35, 395, 150, 50, " Ranger", 20);
        add(radioRanger);
        //JRadio buttons for weapons.
        radioSword = new JRadioButtons(35, 690, 120, 30, " Sword", 20);
        add(radioSword);
        radioStaff = new JRadioButtons(35, 740, 120, 30, " Staff", 20);
        add(radioStaff);
        radioBow = new JRadioButtons(35, 790, 120, 30, " Bow", 20);
        add(radioBow);
        //Button group for character classes.
        charClasses = new ButtonGroup();
        charClasses.add(radioMage);
        charClasses.add(radioPaladin);
        charClasses.add(radioRanger);
        //Button group for weapon types.
        weaponClasses = new ButtonGroup();
        weaponClasses.add(radioSword);
        weaponClasses.add(radioStaff);
        weaponClasses.add(radioBow);


        //JButton for Character Stat Generation.
        statGenBnP2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Plays Dice sound.
                getEffectDice().playOnce();
                //Sets and converts random integers to string.
                strengthTfP2.setText(Integer.toString(randomGenerator()));
                vitalityTfP2.setText(Integer.toString(randomGenerator()));
                intelligenceTfP2.setText(Integer.toString(randomGenerator()));
                dexterityTfP2.setText(Integer.toString(randomGenerator()));
                //Sets text to re-roll once activated.
                statGenBnP2.setText("RE-ROLL");
            }
        });

        //Battle button action listener main panel 2 to 3.
        battleBnP2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Checks inputs of all need values.
                if (inputCheck(playerNameTfP2.getText(), strengthTfP2.getText(), charClasses, weaponClasses)) {
                    //If statements for character generation.
                    if (getRadioMage().isSelected()) {
                        //Sets image to Mage on battle screen.
                        getPicClassLbP3().setIcon(getAMage().getMageImage());
                        //Sets player class title if mage is selected.
                        getClassChoiceLbP3().setText("Player: Mage");
                        //Sets Mage name and stats.
                        getAMage().setPlayerName(playerNameTfP2.getText());
                        getAMage().setStrength(Integer.parseInt(strengthTfP2.getText()));
                        getAMage().setVitality(Integer.parseInt(vitalityTfP2.getText()));
                        getAMage().setIntelligence(Integer.parseInt(intelligenceTfP2.getText()));
                        getAMage().setDexterity(Integer.parseInt(dexterityTfP2.getText()));
                        //Sets mage with currently selected weapon.
                        if (radioSword.isSelected())
                            getAMage().setEquippedWeapon(getASword());
                        else if (radioStaff.isSelected())
                            getAMage().setEquippedWeapon(getAStaff());
                        else if (radioBow.isSelected())
                            getAMage().setEquippedWeapon(getABow());
                        getTextOutTaP3().setText(getAMage().toString());
                        getTextOutTa2P3().setText(getAMage().toString());
                        getTextOutTa3P3().setText(getAMage().toString());
                    }
                    if (radioPaladin.isSelected()) {
                        //Sets image to Paladin on battle screen.
                        getPicClassLbP3().setIcon(getAPaladin().getPaladinImage());
                        //Sets player class title if Paladin is selected.
                        getClassChoiceLbP3().setText("Player: Paladin");
                        //Sets Paladin name and stats.
                        getAPaladin().setPlayerName(playerNameTfP2.getText());
                        getAPaladin().setStrength(Integer.parseInt(strengthTfP2.getText()));
                        getAPaladin().setVitality(Integer.parseInt(vitalityTfP2.getText()));
                        getAPaladin().setIntelligence(Integer.parseInt(intelligenceTfP2.getText()));
                        getAPaladin().setDexterity(Integer.parseInt(dexterityTfP2.getText()));
                        //Sets Paladin with currently selected weapon.
                        if (radioSword.isSelected())
                            getAPaladin().setEquippedWeapon(getASword());
                        else if (radioStaff.isSelected())
                            getAPaladin().setEquippedWeapon(getAStaff());
                        else if (radioBow.isSelected())
                            getAPaladin().setEquippedWeapon(getABow());
                        getTextOutTaP3().setText(getAPaladin().toString());
                        getTextOutTa2P3().setText(getAPaladin().toString());
                        getTextOutTa3P3().setText(getAPaladin().toString());
                    }
                    if (radioRanger.isSelected()) {
                        //Sets image to Ranger on battle screen.
                        getPicClassLbP3().setIcon(getAPaladin().getPaladinImage());
                        //Sets player class title if Ranger is selected.
                        getClassChoiceLbP3().setText("Player: Ranger");
                        //Sets Ranger name and stats.
                        getARanger().setPlayerName(playerNameTfP2.getText());
                        getARanger().setStrength(Integer.parseInt(strengthTfP2.getText()));
                        getARanger().setVitality(Integer.parseInt(vitalityTfP2.getText()));
                        getARanger().setIntelligence(Integer.parseInt(intelligenceTfP2.getText()));
                        getARanger().setDexterity(Integer.parseInt(dexterityTfP2.getText()));
                        //Sets Ranger with currently selected weapon.
                        if (radioSword.isSelected())
                            getAPaladin().setEquippedWeapon(getASword());
                        else if (radioStaff.isSelected())
                            getAPaladin().setEquippedWeapon(getAStaff());
                        else if (radioBow.isSelected())
                            getAPaladin().setEquippedWeapon(getABow());
                        getTextOutTaP3().setText(getARanger().toString());
                        getTextOutTa2P3().setText(getARanger().toString());
                        getTextOutTa3P3().setText(getARanger().toString());
                    }
                    //stops background music.
                    getBGM().stopSound();
                    getNextEffect().playOnce();
                    //resets battle BGM to frame 0.
                    getBattleBGM().reset();
                    //starts battle BGM on continuous loop.
                    getBattleBGM().loopContinuously();
                    //Sets enemy picture.
                    getPicEnemyLbP3().setIcon(getAOrc().getOrcImage());
                    //Sets enemy tile.
                    getMonsterTypeLbP3().setText("Monster: Orc");
                    //Addends Text area output with Orc toString.
                    getTextOutTaP3().append(getAOrc().toString());
                    //Char screen set to invisible.
                    setVisible(false);
                    //Battle screen set to visible.
                    getBattleScreenP3().setVisible(true);
                }
            }
        });
        //JRadioButton Mage action listener.
        getRadioMage().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Plays sound effect once.
                getEffectThunder().playOnce();
                //Gets Class picture.
                getPicClassLbP2().setIcon(getAMage().getMageImage());
                //Changes Description in Class Text area.
                getClassDescription().setText(getAMage().getClassDescription());
            }
        });
        //JRadioButton Paladin action listener.
        getRadioPaladin().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Plays sound effect once.
                getEffectSwords().playOnce();
                //Gets Class picture.
                getPicClassLbP2().setIcon(getAPaladin().getPaladinImage());
                //Changes Description in Class Text area.
                getClassDescription().setText(getAPaladin().getClassDescription());
            }
        });
        //JRadioButton Ranger action listener.
        getRadioRanger().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Plays sound effect once.
                getEffectBow().playOnce();
                //Sets Class picture.
                getPicClassLbP2().setIcon(getARanger().getRangerImage());
                //Changes Description in Class Text area.
                getClassDescription().setText(getARanger().getClassDescription());
            }
        });
        //JRadioButton Sword action listener.
        getRadioSword().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Plays sound effect once.
                getEffectEquip1().playOnce();
                //Gets weapon picture.
                getPicWeaponLbP2().setIcon(getASword().getSwordImage());
                //Changes Description in weapon Text area.
                getWeaponDescription().setText(getASword().getWeaponDescription());
                //Gets weapon labels and text fields.
                getWSpecialTfP2().setText("Attack Modifier");
                getWAttackTfP2().setText("" + getASword().getAttack());
                getWWeightTfP2().setText("" + getASword().getWeight());
                getWSpecialTfP2().setText("" + getASword().getAttackModifier());
            }
        });
        //JRadioButton Staff action listener.
        getRadioStaff().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Plays sound effect once.
                getEffectEquip2().playOnce();
                //Sets weapon picture.
                getPicWeaponLbP2().setIcon(getAStaff().getStaffImage());
                //Changes Description in weapon Text area.
                getWeaponDescription().setText(getAStaff().getWeaponDescription());
                //Sets weapon labels and text fields.
                getWSpecialLbP2().setText("SpellCharges");
                getWAttackTfP2().setText("" + getAStaff().getAttack());
                getWWeightTfP2().setText("" + getAStaff().getWeight());
                getWSpecialTfP2().setText("" + getAStaff().getSpellCharge());
            }
        });
        //JRadioButton Bow action listener.
        getRadioBow().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Plays sound effect once.
                getEffectEquip3().playOnce();
                //Sets weapon picture.
                getPicWeaponLbP2().setIcon(getABow().getBowImage());
                //Changes Description in weapon Text area.
                getWeaponDescription().setText(getABow().getWeaponDescription());
                getWSpecialLbP2().setText("Range Modifier");
                //Sets weapon labels and text fields.
                getWAttackTfP2().setText("" + getABow().getAttack());
                getWWeightTfP2().setText("" + getABow().getWeight());
                getWSpecialTfP2().setText("" + getABow().getRangeModifier());
            }
        });
    }
    private Boolean inputCheck(String name, String stat, ButtonGroup classes, ButtonGroup weapons) {
        //Set boolean to true every time method is run.
        boolean acceptableInput = true;
        //Sets colours for JOptionPanes.
        UIManager.put("OptionPane.background", Color.BLACK);
        UIManager.put("Panel.background", Color.BLACK);
        UIManager.put("Button.background", Color.BLACK);
        UIManager.put("Button.foreground", Color.WHITE);
        //Creates new Label to pin to JOptionPanes.
        JLabel message = new JLabel("");
        message.setBackground(Color.BLACK);
        message.setForeground(Color.WHITE);
        JButton button = new JButton("OK");
        button.setBackground(Color.BLACK);
        button.setForeground(Color.WHITE);
        //Name input checking.
        if (name.isEmpty()) {
            //Sets text of JOptionpane Label.
            message.setText("  Please Enter a Name.");
            //Displays JOptionpane to User.
            JOptionPane.showMessageDialog(null, message, "Whoops", JOptionPane.ERROR_MESSAGE);
            acceptableInput = false;
        }
        //Classes input checking.
        else if (classes.getSelection() == null) {
            //Sets text of JOptionpane Label.
            message.setText("Please Select a Class.");
            //Displays JOptionpane to User.
            JOptionPane.showMessageDialog(null, message, "Whoops", JOptionPane.ERROR_MESSAGE);
            acceptableInput = false;
        }
        //Weapons input checking.
        else if (weapons.getSelection() == null) {
            //Sets text of JOptionpane Label.
            message.setText("Please Select a Weapon.");
            //Displays JOptionpane to User.
            JOptionPane.showMessageDialog(null, message, "Whoops", JOptionPane.ERROR_MESSAGE);
            acceptableInput = false;
        }
        //Character stat input checking.
        else if (stat.isEmpty()) {
            //Sets text of JOptionpane Label.
            message.setText("Please Roll your characters Stats.");
            //Displays JOptionpane to User.
            JOptionPane.showMessageDialog(null, message, "Whoops", JOptionPane.ERROR_MESSAGE);
            acceptableInput = false;
        }
        return acceptableInput;
    }

    static JLabels getPicClassLbP2() { return picClassLbP2; }

    static JLabels getPicWeaponLbP2() { return picWeaponLbP2; }

    private static JLabels getWSpecialLbP2() { return wSpecialLbP2; }

    static JTextFields getPlayerNameTfP2() { return playerNameTfP2; }

    static JTextFields getStrengthTfP2() { return strengthTfP2; }

    static JTextFields getVitalityTfP2() { return vitalityTfP2; }

    static JTextFields getIntelligenceTfP2() { return intelligenceTfP2; }

    static JTextFields getDexterityTfP2() { return dexterityTfP2; }

    static JTextFields getWAttackTfP2() { return wAttackTfP2; }

    static JTextFields getWWeightTfP2() { return wWeightTfP2; }

    static JTextFields getWSpecialTfP2() { return wSpecialTfP2; }

    static JButton getStatGenBnP2() { return statGenBnP2; }

    static JTextAreas getClassDescription() { return classDescription; }

    static JTextAreas getWeaponDescription() { return weaponDescription; }

    static ButtonGroup getCharClasses() { return charClasses; }

    static ButtonGroup getWeaponClasses() { return weaponClasses; }

    private static JRadioButtons getRadioMage() { return radioMage; }

    private static JRadioButtons getRadioPaladin() { return radioPaladin; }

    private static JRadioButtons getRadioRanger() { return radioRanger; }

    private static JRadioButtons getRadioSword() { return radioSword; }

    private static JRadioButtons getRadioStaff() { return radioStaff; }

    private static JRadioButtons getRadioBow() { return radioBow; }
}

