package nscc.ca.CharacterClasses;

import nscc.ca.EquipmentClasses.Equipment;
import javax.swing.*;

//Character Class extends from Player & Character.
public class Ranger extends Player {

    private int rangeBonus;
    private ImageIcon rangerImage;
    private String classDescription;

    //Constructor.
    public Ranger(String playerName, Equipment equippedWeapon, int strength, int intelligence, int dexterity, int vitality, int agility, int rangeBonus) {
        super(playerName, equippedWeapon, strength, intelligence, dexterity, vitality, agility);
        this.rangeBonus = rangeBonus;
        this.rangerImage = new ImageIcon(this.getClass().getResource("/Images/Ranger.png"));
        this.classDescription = " THE RANGER\n SKILLED WITH THE USE OF LONG RANGE WEAPONS. HIGH\n DEXTERITY AND INTELLIGENCE, LOW STRENGTH AND VITALITY.";
    }

    public ImageIcon getRangerImage() { return rangerImage; }

    public String getClassDescription() { return classDescription; }

    //To String formats text for ranger output in battle screen.
    @Override
    public String toString() {
        return
        String.format(" Player: %1$-20s", getPlayerName()) + "\n" +
        " ----------------------------------------------------------------------------------------" + "\n" +
        String.format("%1$-20s", " Stats: ") + String.format("%1$-20s", " Strength: " + getStrength())
        + String.format("%1$-20s", "Vitality: " + getVitality())
        + String.format("%1$-20s", "Intelligence: " + getIntelligence())
        + String.format("%1$-20s","Dexterity: " + getDexterity())
        + String.format("%1$-20s","Agility: " + getAgility()) + "\n" + getEquippedWeapon();
    }
}
