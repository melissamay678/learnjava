import java.util.Scanner;
/**
 * This program counts up or down between two numbers entered by the user.
 *
 * @author Melissa Mahlberg
 * @version 1   07/14/2020
 */
public class CountingLoop {
    public static void main(String[] args) {
        //declare variables
        int start = 0;
        int end = 0;
        int counter = 0;
        Scanner input = new Scanner(System.in);

        //get starting and ending numbers
        System.out.print("Enter a starting number: ");
        start = input.nextInt();
        counter = start;
        System.out.print("Enter an ending number: ");
        end = input.nextInt();

        //Counting loops
        System.out.println("\nCounting from " + start + " to " + end + ":");

        if (start <= end) {                         //counting up
            while (counter <= end) {
                System.out.println(" " + counter);
                counter = counter + 1;
            }
        }
        else {                                      //counting down
            while (counter >= end) {
                System.out.println(" " + counter);
                counter = counter -1;
            }
        }
    }   
}
