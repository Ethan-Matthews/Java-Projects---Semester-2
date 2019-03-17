package nscc.ca.EquipmentClasses;

import javax.swing.*;

//Custom Class extends Equipment.
public class Sword extends Equipment {

    private int attackModifier;
    private ImageIcon swordImage;
    private String weaponDescription;
    //Constructor
    public Sword(int weight, int attack, int attackModifier) {
        super(weight, attack);
        this.attackModifier = attackModifier;
        this.swordImage = new ImageIcon(this.getClass().getResource("/Images/sword_3.png"));
        this.weaponDescription = " THE SWORD\n A ONE HANDED BLADE. MOST BASIC OF MELEE WEAPONS.\n HAS BONUS ATTACK MODIFIER.";
    }
    //Getters.
    public int getAttackModifier() { return attackModifier; }

    public ImageIcon getSwordImage() { return swordImage; }

    public String getWeaponDescription() { return weaponDescription; }

    //To String formats text for Sword output in Char screen.
    @Override
    public String toString() {
        return String.format("%1$-16s"," Weapon:") + String.format("%1$-19s", "Weight: " + getWeight()) + String.format("%1$-20s", "Attack: " + getAttack())+ String.format("%1$-19s", "Attack Modifier: " + getAttackModifier()) + "\n";

    }


}
