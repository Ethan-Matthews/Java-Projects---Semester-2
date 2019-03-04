package nscc.ca;

public class Paladin extends Player {

    private int healBonus;

    public Paladin(String playerName, Equipment equippedWeapon, int strength, int intelligence, int dexterity, int vitality, int healBonus) {
        super(playerName, equippedWeapon, strength, intelligence, dexterity, vitality);
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
