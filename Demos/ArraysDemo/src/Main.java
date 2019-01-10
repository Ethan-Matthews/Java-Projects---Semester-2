public class Main {
    public static void main(String[] args) {

        //Example of initializing an array.
        //defaulted to holding 5 zeros.
        int[] bob = new int[5];

        //Initialize an array with my values.
        int[] bill = {1, 2, 3, 7, 11, 5, 2};

        System.out.println("Length of the array is: " + bill.length);

        //For loop to print each value to console.
        for (int i = 0; i < bill.length; i++) {
            System.out.println("Current Value: " + bill[i]);
        }

        //Example of for each loop.
        for (int currentNumber : bill) {
            System.out.println(currentNumber);


        }

    }
}
