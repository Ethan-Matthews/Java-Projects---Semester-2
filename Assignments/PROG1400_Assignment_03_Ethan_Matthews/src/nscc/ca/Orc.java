package nscc.ca;
//Monster Class extends from Player & Character.
public class Orc extends Monster {

    private int strengthBonus;
    //Constructor
    public Orc(String monsterName, int strength, int intelligence, int dexterity, int vitality, int strengthBonus) {
        super(monsterName, strength, intelligence, dexterity, vitality);
        this.strengthBonus = strengthBonus;
    }

    public int getStrengthBonus() {
        return strengthBonus;
    }
    //To String formats text for Orc output in battle screen.
    @Override
    public String toString() {
        return
        String.format("%1$-20s","\n Monster: " + getMonsterName()) + "\n" +
        " ----------------------------------------------------------------------------------------" + "\n" +
        String.format("%1$-20s", " Stats: ") + String.format("%1$-20s", " Strength: " + getStrength()) + String.format("%1$-20s", "Vitality: " + getVitality()) + String.format("%1$-20s", "Intelligence: " + getIntelligence()) + String.format("%1$-20s","Dexterity: " + getDexterity()) + "\n" +
        String.format("%1$-19s"," Special: ") + String.format("%1$-19s", "Strength Bonus: " + getStrengthBonus());
    }

}
