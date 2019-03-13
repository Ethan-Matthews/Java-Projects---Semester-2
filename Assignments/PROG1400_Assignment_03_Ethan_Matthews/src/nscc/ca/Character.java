package nscc.ca;
//Abstract Super Class Character.
public abstract class Character {
    private int strength;
    private int vitality;
    private int intelligence;
    private int dexterity;
    //Constructor
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

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
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
