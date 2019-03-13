package nscc.ca;
//Character Class extends from Player & Character.
public class Ranger extends Player {

    private int rangeBonus;
    //Constructor.
    public Ranger(String playerName, Equipment equippedWeapon, int strength, int intelligence, int dexterity, int vitality, int rangeBonus) {
        super(playerName, equippedWeapon, strength, intelligence, dexterity, vitality);
        this.rangeBonus = rangeBonus;
    }

    public int getRangeBonus() {
        return rangeBonus;
    }

    public void setRangeBonus(int rangeBonus) {
        this.rangeBonus = rangeBonus; }
    //To String formats text for ranger output in battle screen.
    @Override
    public String toString() {
        return
        String.format(" Player: %1$-20s", getPlayerName()) + "\n" +
        " ----------------------------------------------------------------------------------------" + "\n" +
        String.format("%1$-20s", " Stats: ") + String.format("%1$-20s", " Strength: " + getStrength()) + String.format("%1$-20s", "Vitality: " + getVitality()) + String.format("%1$-20s", "Intelligence: " + getIntelligence()) + String.format("%1$-20s","Dexterity: " + getDexterity()) + "\n" +
        getEquippedWeapon();
    }
}
