import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    //Variables
    double shippingFee = 10.00;
    double shippingThreshold = 50.00;
    double orderTotal = 0.00;

    //Welcome Banner
    System.out.println("Welcome to the Shipping Calculator Program" + "\n");

    //User input
    System.out.print("Please enter the cost of the order: $");

    //Calculation
    Scanner sc = new Scanner(System.in);
    double orderCost = sc.nextFloat();

    if (orderCost < shippingThreshold) {
        orderTotal = orderCost + shippingFee;
        System.out.print("You have spent less than $");
        System.out.printf("%.2f", shippingThreshold);
        System.out.print(" and will be charged a shipping fee of $");
        System.out.printf("%.2f", shippingFee);
    }

    else {
        orderTotal = orderCost;
        System.out.print("You have spent $");
        System.out.printf("%.2f", shippingThreshold);
        System.out.println(" or more, and won't be charged a shipping fee.");
    }


    //Output Total
    System.out.print("\n" + "Your total for the order is: $");
    System.out.printf("%.2f", orderTotal);
    System.out.println("\n" + "\n" + "Thank you for using the shipping calculator.");
    }
}
