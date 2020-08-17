import java.util.Scanner;
/**
 * This program calculates the first n numbers of the Fibonacci sequence.
 * The 93rd value exceeds the capacity of a long type.
 *
 * @author Melissa Mahlberg
 * @version 1 
 */
public class Fibonacci {
    public static void main(String[] args) {
        // declare variables
        long firstFibonacci = 0;
        long secondFibonacci = 1;
        long fibonacciValue = 0;
        int number = 0;
        int counter = 1;
        Scanner input = new Scanner(System.in);

        // get and check number
        System.out.print("Enter an integer between 1 and 92: ");
        number = input.nextInt();
        if (number < 1  || number > 92 ) {
            System.out.println("That number was not between 1 and 92.  Try running the program again.");
            System.exit(0);
        }

        // Fibonacci loop
        counter = 1;
        while (counter <= number) {
            if (counter == 1) {
                fibonacciValue = firstFibonacci;
            }
            else if (counter == 2) {
                fibonacciValue = secondFibonacci;
            }
            else {
                fibonacciValue = firstFibonacci + secondFibonacci;
                firstFibonacci = secondFibonacci;
                secondFibonacci = fibonacciValue;
            }
            System.out.println("Fibonacci value #" + counter + " is " + fibonacciValue);
            counter = counter + 1;
        }
    }
}