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
        return String.format("%1$-16s"," Weapon:") + String.format("%1$-19s", "Weight: " + getWeight()) + String.format("%1$-20s", "Attack: " + getAttack())+ String.format("%1$-19s", "Attack Modifier: " + getAttackModifier()) + "\n";

    }


}
