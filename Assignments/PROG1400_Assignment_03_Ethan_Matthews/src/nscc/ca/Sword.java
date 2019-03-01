package nscc.ca;

public class Sword extends Equipment {

    private int attackModifier;

    public Sword(int weight, int attack, int attackModifier) {
        super(weight, attack);
        this.attackModifier = attackModifier;
    }

    public int getAttackModifier() {
        return attackModifier;
    }

    @Override
    public String toString() {
        return "Sword{" +
                "attackModifier=" + attackModifier +
                '}';
    }


}
