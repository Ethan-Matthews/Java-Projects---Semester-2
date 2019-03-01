package nscc.ca;

public class Orc extends Monster {

    private int strengthBonus;

    public Orc(int strength, int intelligence, int dexterity, int vitality, int strengthBonus) {
        super(strength, intelligence, dexterity, vitality);
        this.strengthBonus = strengthBonus;
    }

    public int getStrengthBonus() {
        return strengthBonus;
    }

    @Override
    public String toString() {
        return "Orc{" +
                "strengthBonus=" + strengthBonus +
                '}';
    }

}
