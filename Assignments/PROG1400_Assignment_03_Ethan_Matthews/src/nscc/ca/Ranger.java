package nscc.ca;

public class Ranger extends Player {

    private int rangeBonus;

    public Ranger(int strength, int intelligence, int dexterity, int vitality, int rangeBonus) {
        super(strength, intelligence, dexterity, vitality);
        this.rangeBonus = rangeBonus;
    }

    public int getRangeBonus() {
        return rangeBonus;
    }

    @Override
    public String toString() {
        return "Ranger{" +
                "rangeBonus=" + rangeBonus +
                '}';
    }
}
