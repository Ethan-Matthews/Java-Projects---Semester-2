package nscc.ca;

public class Character {
    private int strength;
    private int intelligence;
    private int dexterity;
    private int vitality;

    public Character(int strength, int intelligence, int dexterity, int vitality) {
        this.strength = strength;
        this.intelligence = intelligence;
        this.dexterity = dexterity;
        this.vitality = vitality;

    }

    public int getStrength() {
        return strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getVitality() {
        return vitality;
    }

    @Override
    public String toString() {
        return "Character{" +
                "strength=" + strength +
                ", intelligence=" + intelligence +
                ", dexterity=" + dexterity +
                ", vitality=" + vitality +
                '}';
    }
}
