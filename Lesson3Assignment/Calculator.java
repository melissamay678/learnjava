import java.util.Scanner;

public class Calculator {
    public static void main(String [] args) {
        
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter in first Number: ");
        //take number and store in variable
        double num1 = keyboardInput.nextDouble();
        
        System.out.print("Enter in second Number: ");
        //take number and store in variable
        double num2 = keyboardInput.nextDouble();
        
        System.out.println(num1 + num2);
    }
}