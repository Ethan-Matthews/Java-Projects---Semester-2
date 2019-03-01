package nscc.ca;

public class Dragon extends Monster {

    private String breathType;

    public Dragon(int strength, int intelligence, int dexterity, int vitality, String breathType) {
        super(strength, intelligence, dexterity, vitality);
        this.breathType = breathType;
    }

    public String getBreathType() {
        return breathType;
    }

    @Override
    public String toString() {
        return "Dragon{" +
                "breathType='" + breathType + '\'' +
                '}';
    }
}
