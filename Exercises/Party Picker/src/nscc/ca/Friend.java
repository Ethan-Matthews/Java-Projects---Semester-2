package nscc.ca;

public class Friend extends Person {
    private String food;

    public Friend(String firstName, String lastName, boolean isInvited, String food) {
        super(firstName, lastName, isInvited);
        this.food = food;
    }

    @Override
    public String toString() {
        String allValues = super.getFullName() + " is bringing " + this.food + " They are " + super.isInvited() + "invited to the party.";
        return allValues;
    }
}
