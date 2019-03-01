package nscc.ca;

public class Skeleton extends Monster {

    private int resurrectionCharge;

    public Skeleton(int strength, int intelligence, int dexterity, int vitality, int resurrectionCharge) {
        super(strength, intelligence, dexterity, vitality);
        this.resurrectionCharge = resurrectionCharge;
    }

    public int getResurrectionCharge() {
        return resurrectionCharge;
    }

    @Override
    public String toString() {
        return "Skeleton{" +
                "resurrectionCharge=" + resurrectionCharge +
                '}';
    }


}
