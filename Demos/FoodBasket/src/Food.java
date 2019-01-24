public class Food {
    //Constructor with parameters.
    String Name;
    String Type;
    public Food(String foodName, String foodType) {
        this.Name = foodName;
        this.Type = foodType;
    }


    //Deny Method. Triggered when flag is true.
    public void denyIT(){
        System.out.print("You just denied the " + this.Name);
    }
    //Eat Method. Triggered when flag is false.
    public void eatIT() {
        System.out.print("You just ate the " + this.Name);

    }
}
