package nscc.ca.EnemyClasses;

import nscc.ca.CharacterClasses.Character;

//Abstract Super Class extends from Character.
public abstract class Monster extends Character {

    private String monsterName;
    //Constructor.
    public Monster(String monsterName, int strength, int vitality, int intelligence, int dexterity, int agility) {
        super(strength, intelligence, dexterity, vitality, agility);
        this.monsterName = monsterName;
    }
    //Getters.
    public String getMonsterName() {
        return monsterName;
    }
    //Setters.
    public void setMonsterName(String monsterName) { this.monsterName = monsterName; }

    @Override
    public abstract String toString();



}
