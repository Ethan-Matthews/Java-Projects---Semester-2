package nscc.ca;
//Monster Class extends from Player & Character.
public class Dragon extends Monster {

    private String breathType;
    //Constructor.
    public Dragon(String monsterName, int strength, int intelligence, int dexterity, int vitality, String breathType) {
        super(monsterName, strength, intelligence, dexterity, vitality);
        this.breathType = breathType;
    }

    public String getBreathType() {
        return breathType;
    }

    public void setBreathType(String breathType) {
        this.breathType = breathType; }

    //To String formats text for Dragon output in battle screen.
    @Override
    public String toString() {
        return
        String.format("%1$-20s","\n Monster: " + getMonsterName()) + "\n" +
        " ----------------------------------------------------------------------------------------" + "\n" +
        String.format("%1$-20s", " Stats: ") + String.format("%1$-20s", " Strength: " + getStrength()) + String.format("%1$-20s", "Vitality: " + getVitality()) + String.format("%1$-20s", "Intelligence: " + getIntelligence()) + String.format("%1$-20s","Dexterity: " + getDexterity()) + "\n" +
        String.format("%1$-19s"," Special: ") + String.format("%1$-19s", "Breath Type: " + getBreathType());
    }
}
