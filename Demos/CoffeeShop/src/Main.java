import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double priceOfCoffee = 1.25;
        double taxRate = 1.15;

        //Welcome Message Displayed
        System.out.println("Welcome to the Coffee Shop");

        //Gather number if cups from user
        System.out.print("Enter the number of cups: ");

        //Calculate pretax cost (number of cups * price)
        Scanner sc = new Scanner(System.in);
        int numOfCups = sc.nextInt();
        double preTaxCost = numOfCups * priceOfCoffee;

        //Display pre-tax cost to user
        System.out.print("Your pretax cost is: $");
        System.out.println(preTaxCost);

        //Calc final cost (Pretax cost * tax)
        double finalCost = preTaxCost * taxRate;

        //Display final output to user
        System.out.print("Your Total Cost is: $");
        System.out.println(finalCost);

    }
}
