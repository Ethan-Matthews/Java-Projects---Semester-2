package nscc.ca;

import javax.swing.*;

//Character Class extends from Player & Character.
public class Mage extends Player {

    private int spellPower;
    //Constructor.
    public Mage(String playerName, Equipment equippedWeapon, int strength, int intelligence, int dexterity, int vitality, int spellPower) {
        super(playerName, equippedWeapon, strength, intelligence, dexterity, vitality);
        this.spellPower = spellPower;
    }
    public int getSpellPower() {
        return spellPower;
    }

    public void setSpellPower(int spellPower) {
        this.spellPower = spellPower; }
    //To String formats text for Mage output in battle screen.
    @Override
    public String toString() {
        return
        String.format(" Player: %1$-20s", getPlayerName()) + "\n" +
        " ----------------------------------------------------------------------------------------" + "\n" +
        String.format("%1$-20s", " Stats: ") + String.format("%1$-20s", " Strength: " + getStrength()) + String.format("%1$-20s", "Vitality: " +
        getVitality()) + String.format("%1$-20s", "Intelligence: " + getIntelligence()) + String.format("%1$-20s","Dexterity: " + getDexterity()) +
        "\n" + getEquippedWeapon();
    }
}
