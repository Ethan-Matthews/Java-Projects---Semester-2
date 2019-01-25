package ca.nscc;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
    System.out.println("Please enter the length: ");
    Scanner length = new Scanner(System.in);

    System.out.println("Please enter the width: ");
    Scanner width = new Scanner(System.in);

    System.out.println("Please enter the address: ");
    Scanner address = new Scanner(System.in);

    System.out.println("Please enter the colour: ");
    Scanner colour = new Scanner(System.in);

    House myHouse = new House(length, width, address, colour);

    }
}
