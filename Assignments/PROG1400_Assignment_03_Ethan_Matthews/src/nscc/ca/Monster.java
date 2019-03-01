package nscc.ca;

public class Monster extends Character {

    private String monsterName;

    public Monster(int strength, int intelligence, int dexterity, int vitality) {
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
