import java.util.Scanner;
/**
 * This program will ask the user for two strings, compares them, and 
 * displays them in alphabetical order.
 *
 * @author Melissa Mahlberg
 * @version 1.0     7/11/2020
 */
public class StringComparison {
    public static void main(String[] args) {
        String s1; // first number
        String s2; // second number
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a text string: ");
        s1 = input.nextLine();
        System.out.print("Enter another text string: ");
        s2 = input.nextLine();
        if (s1.compareToIgnoreCase(s2) < 0) {
            System.out.println("Your strings in alphabetical order are:");
            System.out.println("   " + s1);
            System.out.println("   " + s2);
        }
        else if (s1.compareToIgnoreCase(s2) > 0) {
            System.out.println("Your strings in alphabetical order are:");
            System.out.println("   " + s2);
            System.out.println("   " + s1);
        }
        else
            System.out.println("Your strings are identical; there's no point in sorting them.  :-)");
    }
}
