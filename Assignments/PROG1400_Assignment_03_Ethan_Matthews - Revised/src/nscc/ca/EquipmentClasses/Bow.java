package nscc.ca.EquipmentClasses;

import javax.swing.*;

//Custom Class extends Equipment.
public class Bow extends Equipment{

    private int rangeModifier;
    private ImageIcon bowImage;
    private String weaponDescription;

    public Bow(int weight, int attack, int rangeModifier) {
        super(weight, attack);
        this.rangeModifier = rangeModifier;
        this.bowImage = new ImageIcon(this.getClass().getResource("/Images/Bow2.png"));
        this.weaponDescription = " THE BOW\n A BOW AND ARROWS. A RANGERS BEST FRIEND.\n HAS BONUS RANGE MODIFIER.";
    }
    //Getters.
    public int getRangeModifier() { return rangeModifier; }

    public ImageIcon getBowImage() { return bowImage; }

    public String getWeaponDescription() { return weaponDescription; }

    //Setters.
    public void setBowImage(ImageIcon bowImage) { this.bowImage = bowImage; }

    public void setRangeModifier(int rangeModifier) { this.rangeModifier = rangeModifier; }

    public void setWeaponDescription(String weaponDescription) { this.weaponDescription = weaponDescription; }

    //To String formats text for Bow output in Char screen.
    @Override
    public String toString() {
        return String.format("%1$-16s"," Weapon:") + String.format("%1$-19s", "Weight: " + getWeight()) + String.format("%1$-20s", "Attack: " + getAttack())+ String.format("%1$-17s", "Range Modifier: " + getRangeModifier()) + "\n";

    }


}
