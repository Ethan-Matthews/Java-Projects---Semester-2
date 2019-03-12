package nscc.ca.JavaSwingClasses;

import nscc.ca.CharacterClasses.Mage;
import nscc.ca.CharacterClasses.Paladin;
import nscc.ca.CharacterClasses.Ranger;
import nscc.ca.EnemyClasses.Dragon;
import nscc.ca.EnemyClasses.Orc;
import nscc.ca.EnemyClasses.Skeleton;
import nscc.ca.EquipmentClasses.Bow;
import nscc.ca.EquipmentClasses.Staff;
import nscc.ca.EquipmentClasses.Sword;
import nscc.ca.SoundClass.Sound;

import javax.swing.*;
import java.awt.*;

public class JFrames extends JFrame {

    private static BattleOutput battleScreenP3;
    private static CharacterSelect characterSelectP2;

    private static Mage aMage;
    private static Paladin aPaladin;
    private static Ranger aRanger;

    private static Orc aOrc;
    private static Skeleton aSkeleton;
    private static Dragon aDragon;

    private static Sword aSword;
    private static Staff aStaff;
    private static Bow aBow;

    private static Sound restartEffect;
    private static Sound nextEffect;
    private static Sound effectEquip1;
    private static Sound effectEquip2;
    private static Sound effectEquip3;
    private static Sound effectBow;
    private static Sound effectSwords;
    private static Sound effectThunder;
    private static Sound effectDice;
    private static Sound effectGate;
    private static Sound battleBGM;
    private static Sound BGM;

    public JFrames() {
        //Creates new Sound effect Objects
        restartEffect = new Sound("Audio/Applause1.wav");
        nextEffect = new Sound("Audio/BattleStart.wav");
        effectEquip1 = new Sound("Audio/Equip1.wav");
        effectEquip2 = new Sound("Audio/Equip2.wav");
        effectEquip3 = new Sound("Audio/Equip3.wav");
        effectBow = new Sound("Audio/Bow4.wav");
        effectSwords = new Sound("Audio/Sword6.wav");
        effectThunder = new Sound("Audio/Thunder10.wav");
        effectDice = new Sound("Audio/Roll_Dice.wav");
        effectGate = new Sound("Audio/Gate2.wav");
        battleBGM = new Sound("Audio/Battle5.wav");
        BGM = new Sound("Audio/Theme1.wav");

        //Creates Default Character Classes.
        aMage = new Mage(null, null, 0, 0, 0, 0, randomGenerator());
        aPaladin = new Paladin(null, null, 0, 0, 0, 0, randomGenerator());
        aRanger = new Ranger(null, null, 0, 0, 0, 0, randomGenerator());

        //Creates new weapon objects that aggregate to character classes.
        aSword = new Sword(randomGenerator(), randomGenerator(), randomGenerator());
        aStaff = new Staff(randomGenerator(), randomGenerator(), randomGenerator());
        aBow = new Bow(randomGenerator(), randomGenerator(), randomGenerator());

        //Creates monsters, one of each type.
        aDragon = new Dragon("Dragon", randomGenerator(), randomGenerator(), randomGenerator(), randomGenerator(), "Fire");
        aSkeleton= new Skeleton("Skeleton", randomGenerator(), randomGenerator(), randomGenerator(), randomGenerator(), randomGenerator());
        aOrc= new Orc("Orc", randomGenerator(), randomGenerator(), randomGenerator(), randomGenerator(), randomGenerator());

        setDefaultCloseOperation(JFrames.EXIT_ON_CLOSE);
        //Title for Program Windows.
        setTitle("Fools Quest RPG Character Creator");
        //Sets Default Size for Frame.
        setSize(1000, 1000);
        //Sets card layout.
        setLayout(new CardLayout(0, 0));

        SplashScreen splashScreenP1 = new SplashScreen();
        characterSelectP2 = new CharacterSelect();
        battleScreenP3 = new BattleOutput();
        add(splashScreenP1);
        add(characterSelectP2);
        add(battleScreenP3);

        //Makes the Program start at the center of the monitor regardless of resolution.
        Dimension Center = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(Center.width/2-this.getSize().width/2, Center.height/2-this.getSize().height/2);
        setResizable(false);

    }

    //Method generates random number between 1 and 20.
    static int randomGenerator() {
        return (int)(Math.random()* 20 + 1);
    }

    static CharacterSelect getCharacterSelectP2() { return characterSelectP2; }

    static BattleOutput getBattleScreenP3() { return battleScreenP3; }

    static Sound getEffectDice() { return effectDice; }

    static Sound getRestartEffect() { return restartEffect; }

    static Sound getNextEffect() { return nextEffect; }

    static Sound getEffectGate() { return effectGate; }

    static Sound getEffectEquip1() { return effectEquip1; }

    static Sound getEffectEquip2() { return effectEquip2; }

    static Sound getEffectEquip3() { return effectEquip3; }

    static Sound getEffectBow() { return effectBow; }

    static Sound getEffectSwords() { return effectSwords; }

    static Sound getEffectThunder() { return effectThunder; }

    static Sound getBattleBGM() { return battleBGM; }

    static Sound getBGM() { return BGM; }

    static Mage getAMage() { return aMage; }

    static Paladin getAPaladin() { return aPaladin; }

    static Ranger getARanger() { return aRanger; }

    static Sword getASword() { return aSword; }

    static Staff getAStaff() { return aStaff; }

    static Bow getABow() { return aBow; }

    static Dragon getADragon() { return aDragon; }

    static Skeleton getASkeleton() { return aSkeleton; }

    static Orc getAOrc() { return aOrc; }

}
