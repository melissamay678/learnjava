import java.util.Scanner;
/**
 * THis program asks the user for two numbers, then compares them and
 * diplays which is greater.
 *
 * @author Melissa Mahlberg
 * @version 1.0     7/11/2020
 */
public class NumberComparison {
    public static void main(String[] args) {
        double number1;
        double number2;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number1 = input.nextDouble();
        System.out.print("Enter another number: ");
        number2 = input.nextDouble();
        
        if (number1 < number2) 
            System.out.println("Your second number, " + number2 +
                ", is greater than your first number, " + number1 + ".");

        else if (number1 > number2) 
            System.out.println("Your first number, " + number1 +
                ", is greater than your second number, " + number2 + ".");

        else 
            System.out.println("Your first number, " + number1 +
                ", is equal to your second number, " + number2 + ".");


    }
}
