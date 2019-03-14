package nscc.ca.CharacterClasses;

import nscc.ca.EquipmentClasses.Equipment;
import javax.swing.*;

//Character Class extends from Player & Character.
public class Mage extends Player {

    private int spellPower;
    private ImageIcon mageImage;
    private String classDescription;

    //Constructor.
    public Mage(String playerName, Equipment equippedWeapon, int strength, int vitality, int intelligence, int dexterity, int agility, int spellPower) {
        super(playerName, equippedWeapon, strength, intelligence, dexterity, vitality, agility);
        this.spellPower = spellPower;
        this.mageImage = new ImageIcon(this.getClass().getResource("/Images/Mage.png"));
        this.classDescription = " THE MAGE\n A MASTER OF THE ELEMENTS AND ARCANE ARTS. HIGH\n INTELLIGENCE AND DEXTERITY, LOW VITALITY AND STRENGTH.";
    }

    public int getSpellPower() {
        return spellPower;
    }

    public ImageIcon getMageImage() { return mageImage; }

    public String getClassDescription() { return classDescription; }

    public void setSpellPower(int spellPower) { this.spellPower = spellPower; }

    public void setMageImage(ImageIcon mageImage) { this.mageImage = mageImage; }

    public void setClassDescription(String classDescription) { this.classDescription = classDescription; }

    //To String formats text for Mage output in battle screen.
    @Override
    public String toString() {
        return
        String.format(" Player: %1$-20s", getPlayerName()) + "\n" +
        " ----------------------------------------------------------------------------------------" + "\n" +
        String.format("%1$-20s", " Stats: ") + String.format("%1$-20s", " Strength: " + getStrength())
        + String.format("%1$-20s", "Vitality: " + getVitality())
        + String.format("%1$-20s", "Intelligence: " + getIntelligence())
        + String.format("%1$-20s","Dexterity: " + getDexterity()) +
        String.format("%1$-20s","Agility: " + getAgility()) + "\n" + getEquippedWeapon();
    }
}
