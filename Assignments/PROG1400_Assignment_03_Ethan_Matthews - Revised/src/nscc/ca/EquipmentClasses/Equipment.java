package nscc.ca.EquipmentClasses;

//Custom abstract Superclass For equipment.
public abstract class Equipment {

    private int weight;
    private int attack;
    //Constructor.
    Equipment(int weight, int attack) {
        this.weight = weight;
        this.attack = attack;
    }

    public int getWeight() {
        return weight;
    }

    public int getAttack() {
        return attack;
    }

    @Override
    public abstract String toString();
}
