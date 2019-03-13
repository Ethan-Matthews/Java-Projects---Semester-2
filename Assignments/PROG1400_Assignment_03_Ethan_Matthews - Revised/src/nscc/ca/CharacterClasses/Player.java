package nscc.ca.CharacterClasses;

import nscc.ca.EquipmentClasses.Equipment;

//Abstract Super Class Extends from Character.
public abstract class Player extends Character{

    private String playerName;
    private Equipment equippedWeapon;
    //Constructor.
    public Player(String playerName, Equipment equippedWeapon, int strength, int intelligence, int dexterity, int vitality) {
        super(strength, intelligence, dexterity, vitality);
        this.playerName = playerName;
        this.equippedWeapon = equippedWeapon;
    }

    public String getPlayerName() {
        return playerName;
    }

    public Equipment getEquippedWeapon() { return equippedWeapon; }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setEquippedWeapon(Equipment equippedWeapon) {
        this.equippedWeapon = equippedWeapon;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerName='" + playerName + '\'' +
                ", equippedWeapon=" + equippedWeapon +
                '}';
    }
}
