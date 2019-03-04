package nscc.ca;

public class Mage extends Player {

    private int spellPower;

    public Mage(String playerName, Equipment equippedWeapon, int strength, int intelligence, int dexterity, int vitality, int spellPower) {
        super(playerName, equippedWeapon, strength, intelligence, dexterity, vitality);
        this.spellPower = spellPower;
    }

    public int getSpellPower() {
        return spellPower;
    }

    @Override
    public String toString() {
        return "Mage{" +
                "spellPower=" + spellPower +
                '}';
    }
}
