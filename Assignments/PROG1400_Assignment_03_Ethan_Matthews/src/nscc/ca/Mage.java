package nscc.ca;

public class Mage extends Player {

    private int spellPower;

    public Mage(int strength, int intelligence, int dexterity, int vitality, int spellPower) {
        super(strength, intelligence, dexterity, vitality);
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
