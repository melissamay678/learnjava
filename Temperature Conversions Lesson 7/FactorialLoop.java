import java.util.Scanner;
/**
 * THis program calculates teh factorial of a number between 0 and 20.
 * The 21st value exceeds the capacity of a long type.
 *
 * @author Melissa Mahlberg
/ * @version 1   07/14/2020
 */
public class FactorialLoop {
    public static void main(String[] args) {
        // declare variables
        long factorial = 1;
        int number = 0;
        int counter = 0;
        Scanner input = new Scanner(System.in);

        // get and check number
        System.out.print("Enter an integer between 0 and 20: ");
        number = input.nextInt();
        if (number < 0 || number > 20) {
            System.out.println("That number was not between 0 and 20.  Try running the program again.");
            System.exit(0);
        }

        // factorial loop
        counter = 2;
        while (counter <= number) {
            factorial = factorial * counter;
            counter = counter + 1;
        }
        System.out.println(number + "! is " + factorial);
    }
}