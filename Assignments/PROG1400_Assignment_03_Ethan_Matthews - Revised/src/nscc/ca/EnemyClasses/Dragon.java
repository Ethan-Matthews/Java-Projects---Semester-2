package nscc.ca.EnemyClasses;

import javax.swing.*;

//Monster Class extends from Player & Character.
public class Dragon extends Monster {

    private String breathType;
    private ImageIcon dragonImage;
    //Constructor.
    public Dragon(String monsterName, int strength,int vitality,  int intelligence, int dexterity, int agility, String breathType) {
        super(monsterName, strength, intelligence, dexterity, vitality, agility);
        this.breathType = breathType;
        this.dragonImage = new ImageIcon(this.getClass().getResource("/Images/Dragon.png"));
    }
    //Getters.
    public String getBreathType() {
        return breathType;
    }

    public ImageIcon getDragonImage() { return dragonImage; }
    //Setters.
    public void setDragonImage(ImageIcon dragonImage) { this.dragonImage = dragonImage; }

    public void setBreathType(String breathType) { this.breathType = breathType; }

    //To String formats text for Dragon output in battle screen.
    @Override
    public String toString() {
        return
        String.format("%1$-20s","\n Monster: " + getMonsterName()) + "\n" +
        " ----------------------------------------------------------------------------------------" + "\n" +
        String.format("%1$-20s", " Stats: ") + String.format("%1$-20s", " Strength: " + getStrength())
        + String.format("%1$-20s", "Vitality: " + getVitality())
        + String.format("%1$-20s", "Intelligence: " + getIntelligence())
        + String.format("%1$-20s","Dexterity: " + getDexterity()) + "\n"
        + String.format("%1$-20s","Agility: " + getAgility()) +
        String.format("%1$-19s"," Special: ") + String.format("%1$-19s", "Breath Type: " + getBreathType());
    }
}
