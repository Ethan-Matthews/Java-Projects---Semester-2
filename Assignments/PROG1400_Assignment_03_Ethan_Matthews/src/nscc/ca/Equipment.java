package nscc.ca;
//Custom abstract Superclass For equipment.
public abstract class Equipment {

    private int weight;
    private int attack;
    //Constructor.
    public Equipment(int weight, int attack) {
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
    public String toString() {
        return "Equipment{" +
                "weight=" + weight +
                ", attack=" + attack +
                '}';
    }



}
