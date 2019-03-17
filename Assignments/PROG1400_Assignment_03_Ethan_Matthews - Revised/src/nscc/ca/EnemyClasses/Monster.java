package nscc.ca.EnemyClasses;

import nscc.ca.CharacterClasses.Character;

//Abstract Super Class extends from Character.
public abstract class Monster extends Character {

    private String monsterName;
    //Constructor.
    Monster(String monsterName, int strength, int vitality, int intelligence, int dexterity, int agility) {
        super(strength, intelligence, dexterity, vitality, agility);
        this.monsterName = monsterName;
    }
    //Getters.
    String getMonsterName() {
        return monsterName;
    }

    @Override
    public abstract String toString();



}
