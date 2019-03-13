package nscc.ca.CharacterClasses;

import nscc.ca.EquipmentClasses.Equipment;
import javax.swing.*;

//Character Class extends from Player & Character.
public class Paladin extends Player {

    private int healBonus;
    private ImageIcon paladinImage;
    private String classDescription;

    //Constructor.
    public Paladin(String playerName, Equipment equippedWeapon, int strength, int vitality, int intelligence, int dexterity, int agility, int healBonus) {
        super(playerName, equippedWeapon, strength, intelligence, dexterity, vitality, agility);
        this.healBonus = healBonus;
        this.paladinImage = new ImageIcon(this.getClass().getResource("/Images/Paladin.png"));
        this.classDescription = " THE RANGER\n SKILLED WITH THE USE OF LONG RANGE WEAPONS. HIGH\n DEXTERITY AND INTELLIGENCE, LOW STRENGTH AND VITALITY.";
    }
    //Getters.
    public int getHealBonus() {
        return healBonus;
    }

    public ImageIcon getPaladinImage() { return paladinImage; }

    public String getClassDescription() { return classDescription; }
    //Setters.
    public void setPaladinImage(ImageIcon paladinImage) { this.paladinImage = paladinImage; }

    public void setClassDescription(String classDescription) { this.classDescription = classDescription; }

    public void setHealBonus(int healBonus) {
        this.healBonus = healBonus;
    }

    //To String formats text for Paladin output in battle screen.
    @Override
    public String toString() {
        return
            String.format(" Player: %1$-20s", getPlayerName()) + "\n" +
            " ----------------------------------------------------------------------------------------" + "\n" +
            String.format("%1$-20s", " Stats: ") + String.format("%1$-20s", " Strength: " + getStrength())
            + String.format("%1$-20s", "Vitality: " + getVitality())
            + String.format("%1$-20s", "Intelligence: " + getIntelligence())
            + String.format("%1$-20s","Dexterity: " + getDexterity()) + "\n"
            + String.format("%1$-20s","Agility: " + getAgility()) + getEquippedWeapon();
    }
}
