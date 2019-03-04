package nscc.ca;

public class Player extends Character{

    private String playerName;
    private Equipment equippedWeapon;

    public Player(String playerName, Equipment equippedWeapon, int strength, int intelligence, int dexterity, int vitality) {
        super(strength, intelligence, dexterity, vitality);
        this.playerName = playerName;
        this.equippedWeapon = equippedWeapon;
    }

    public String getPlayerName() {
        return playerName;
    }

    public Equipment getEquippedWeapon() { return equippedWeapon; }

    @Override
    public String toString() {
        return "Player{" +
                "playerName='" + playerName + '\'' +
                ", equippedWeapon=" + equippedWeapon +
                '}';
    }
}
