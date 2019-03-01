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
        return "Staff{" +
                "spellCharge=" + spellCharge +
                '}';
    }
}
