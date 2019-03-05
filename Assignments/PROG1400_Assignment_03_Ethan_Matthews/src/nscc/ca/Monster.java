package nscc.ca;

public abstract class Monster extends Character {

    private String monsterName;

    public Monster(String monsterName, int strength, int intelligence, int dexterity, int vitality) {
        super(strength, intelligence, dexterity, vitality);
        this.monsterName = monsterName;
    }

    public String getMonsterName() {
        return monsterName;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "monsterName='" + monsterName + '\'' +
                '}';
    }



}
