package nscc.ca.EnemyClasses;

import javax.swing.*;

//Monster Class extends from Player & Character.
public class Skeleton extends Monster {

    private int resurrectionCharge;
    private ImageIcon skeletonImage;
    //Constructor
    public Skeleton(String monsterName, int strength, int vitality, int intelligence, int dexterity, int agility, int resurrectionCharge) {
        super(monsterName, strength, intelligence, dexterity, vitality, agility);
        this.resurrectionCharge = resurrectionCharge;
        this.skeletonImage = new ImageIcon(this.getClass().getResource("/Images/Skeleton_Warrior.png"));
    }
    //Getters
    private int getResurrectionCharge() {
        return resurrectionCharge;
    }

    //To String formats text for skeleton output in battle screen.
    @Override
    public String toString() {
        return
        String.format("%1$-20s","\n Monster: " + getMonsterName()) + "\n" +
        " ----------------------------------------------------------------------------------------" + "\n" +
        String.format("%1$-20s", " Stats: ") + String.format("%1$-20s", " Strength: " + getStrength())
        + String.format("%1$-20s", "Vitality: " + getVitality())
        + String.format("%1$-20s", "Intelligence: " + getIntelligence())
        + String.format("%1$-20s","Dexterity: " + getDexterity()) + "\n"
        + String.format("%1$-20s","Agility: " + getAgility())
        + String.format("%1$-19s", "Resurrection Charge: " +  getResurrectionCharge());
    }


}
