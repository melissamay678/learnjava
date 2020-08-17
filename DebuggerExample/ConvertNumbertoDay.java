import java.util.Scanner;
/**
 * ConvertNumbertoDay program will change the numbers 1 through 7 to 
 * its corresponding day of the week and display that information 
 * to the user.
 * 
 * @author Melissa Mahlberg
 * @version 1.0
 */

public class ConvertNumbertoDay {
    public static void main(String[] args) {
        int dayNumber = 0;
        String dayName = "";
        Scanner in = new Scanner(System.in);
        
        System.out.println("The numbers 1 through 7 represent the days of" +
        "the week beginning with Sunday.");
        System.out.print("Enter a number: ");
        if (in.hasNextInt()) {
            dayNumber = in.nextInt();
            switch (dayNumber) {
                case 1:
                    dayName = "Sunday";
                    break;
                case 2:
                    dayName = "Monday";
                    break;
                case 3:
                    dayName = "Tuesday";
                    break;
                case 4:
                    dayName = "Wednesday";
                    break;
                case 5:
                    dayName = "Thursday";
                    break;
                case 6:
                    dayName = "Friday";
                    break;
                case 7:
                    dayName = "Saturday";
                    break;
                default:
                    dayName = "ERROR - That was not a valid day number!";
                    break;
            }
            System.out.println("The day of the week is: " + dayName + "\n");
        }
        else {
            System.out.println("That was not a number! Please run the program " +
            "again with a number from 1 to 7.\n"); 
        }
    }
}