import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Welcome Banner
        System.out.println("Welcome to the Picnic Program!");

        //First food choice
        System.out.println("Please enter your first food item: ");
        String firstFood = sc.nextLine();
        System.out.println("Type(Fruit, Vegetable, Grain, Meat, Dairy)?: ");
        String firstType = sc.nextLine();

        //Second food choice
        System.out.println("Please enter your second food item: ");
        String secondFood = sc.nextLine();
        System.out.println("Type(Fruit, Vegetable, Grain, Meat, Dairy)?: ");
        String secondType = sc.nextLine();

        //Third food choice
        System.out.println("Please enter your third food item: ");
        String thirdFood = sc.nextLine();
        System.out.println("Type(Fruit, Vegetable, Grain, Meat, Dairy)?: ");
        String thirdType = sc.nextLine();

        //Arrays of names and types.
        String[] nameBasket = {firstFood, secondFood, thirdFood};
        String[] typeBasket = {firstType, secondType, thirdType};

        //Pre-initialized Object Array.
        Food[] foodObjectArray = new Food[3];

        //For loop for user inputs and object creation.
        for (int i = 0; i <= nameBasket.length; i++) {
            String foodName = nameBasket[i];
            String foodType = typeBasket[i];
            //I'm running into a scope error here while trying to name my new food object.
            Food currentFood = new Food(foodName, foodType);
            //Adds food objects to Array.
            foodObjectArray[i] = currentFood;
        }


        // for loop for
        for (int i = 0; i <= foodObjectArray.length; i++) {
            //Used Equals because I could find what I was looking for. Something to compare object attributes.
            //I.E if foodObjectArray[i].type == String "Vegetable"
            if (foodObjectArray[i].Type.equals("Vegetable")) {
                //Calls denyIT method;
                foodObjectArray[i].denyIT();
            }
            else {
                //calls eatIT method;
                foodObjectArray[i].eatIT();
            }
        }
    }
}
