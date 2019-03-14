package nscc.ca.EnemyClasses;

import javax.swing.*;

//Monster Class extends from Player & Character.
public class Orc extends Monster {

    private int strengthBonus;
    private ImageIcon orcImage;
    //Constructor
    public Orc(String monsterName, int strength, int vitality, int intelligence, int dexterity, int agility, int strengthBonus) {
        super(monsterName, strength, intelligence, dexterity, vitality, agility);
        this.strengthBonus = strengthBonus;
        this.orcImage = new ImageIcon(this.getClass().getResource("/Images/Orc.png"));
    }
    //Getters.
    public int getStrengthBonus() {
        return strengthBonus;
    }

    public ImageIcon getOrcImage() { return orcImage; }
    //Setters.
    public void setStrengthBonus(int strengthBonus) { this.strengthBonus = strengthBonus; }

    public void setOrcImage(ImageIcon orcImage) { this.orcImage = orcImage; }

    //To String formats text for Orc output in battle screen.
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
        + String.format("%1$-19s", "Strength Bonus: " + getStrengthBonus());
    }

}
