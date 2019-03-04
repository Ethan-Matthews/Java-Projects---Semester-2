package nscc.ca;

public class Character {
    private int strength;
    private int vitality;
    private int intelligence;
    private int dexterity;


    public Character(int strength, int vitality, int intelligence, int dexterity) {
        this.strength = strength;
        this.vitality = vitality;
        this.intelligence = intelligence;
        this.dexterity = dexterity;



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
