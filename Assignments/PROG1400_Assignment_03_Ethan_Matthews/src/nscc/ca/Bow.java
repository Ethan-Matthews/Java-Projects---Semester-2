package nscc.ca;

public class Bow extends Equipment{

    private int rangeModifier;

    public Bow(int weight, int attack, int rangeModifier) {
        super(weight, attack);
        this.rangeModifier = rangeModifier;
    }

    public int getRangeModifier() {
        return rangeModifier;
    }

    @Override
    public String toString() {
        return "Bow{" +
                "rangeModifier=" + rangeModifier +
                '}';
    }


}
