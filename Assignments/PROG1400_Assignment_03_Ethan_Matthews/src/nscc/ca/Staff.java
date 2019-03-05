package nscc.ca;

public class Staff extends Equipment{

    private int spellCharge;

    public Staff(int weight, int attack, int spellCharge) {
        super(weight, attack);
        this.spellCharge = spellCharge;
    }

    public int getSpellCharge() {
        return spellCharge;
    }

    @Override
    public String toString() {
        return String.format("%1$-16s"," Weapon:") + String.format("%1$-19s", "Weight: " + getWeight()) + String.format("%1$-20s", "Attack: " + getAttack())+ String.format("%1$-20s", "SpellCharge: " + getSpellCharge()) + "\n";
    }
}
