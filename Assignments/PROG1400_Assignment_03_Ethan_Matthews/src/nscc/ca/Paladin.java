package nscc.ca;

public class Paladin extends Player {

    private int healBonus;

    public Paladin(int strength, int intelligence, int dexterity, int vitality, int healBonus) {
        super(strength, intelligence, dexterity, vitality);
        this.healBonus = healBonus;
    }

    public int getHealBonus() {
        return healBonus;
    }

    @Override
    public String toString() {
        return "Paladin{" +
                "healBonus=" + healBonus +
                '}';
    }

}
