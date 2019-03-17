package nscc.ca.EquipmentClasses;

import javax.swing.*;

//Custom Class extends Equipment.
public class Staff extends Equipment{

    private int spellCharge;
    private ImageIcon staffImage;
    private String weaponDescription;

    public Staff(int weight, int attack, int spellCharge) {
        super(weight, attack);
        this.spellCharge = spellCharge;
        this.staffImage = new ImageIcon(this.getClass().getResource("/Images/Staff.png"));
        this.weaponDescription = " THE STAFF\n A TWO HANDED STAFF. PERFECT FOR CHANNELING ARCANE\n POWER. HAS BONUS SPELL CHARGES.";
    }
    //Getters.
    public int getSpellCharge() { return spellCharge; }

    public ImageIcon getStaffImage() { return staffImage; }

    public String getWeaponDescription() { return weaponDescription; }

    //To String formats text for Staff output in Char screen.
    @Override
    public String toString() {
        return String.format("%1$-16s"," Weapon:") + String.format("%1$-19s", "Weight: " + getWeight()) + String.format("%1$-20s", "Attack: " + getAttack())+ String.format("%1$-20s", "SpellCharge: " + getSpellCharge()) + "\n";
    }
}
