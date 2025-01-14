package nscc.ca;
//Character Class extends from Player & Character.
public class Paladin extends Player {

    private int healBonus;
    //Constructor.
    public Paladin(String playerName, Equipment equippedWeapon, int strength, int intelligence, int dexterity, int vitality, int healBonus) {
        super(playerName, equippedWeapon, strength, intelligence, dexterity, vitality);
        this.healBonus = healBonus;
    }

    public int getHealBonus() {
        return healBonus;
    }

    public void setHealBonus(int healBonus) {
        this.healBonus = healBonus;
    }
    //To String formats text for Paladin output in battle screen.
    @Override
    public String toString() {
        return
            String.format(" Player: %1$-20s", getPlayerName()) + "\n" +
            " ----------------------------------------------------------------------------------------" + "\n" +
            String.format("%1$-20s", " Stats: ") + String.format("%1$-20s", " Strength: " + getStrength()) + String.format("%1$-20s", "Vitality: " + getVitality()) + String.format("%1$-20s", "Intelligence: " + getIntelligence()) + String.format("%1$-20s","Dexterity: " + getDexterity()) + "\n" +
            getEquippedWeapon();
    }

}
