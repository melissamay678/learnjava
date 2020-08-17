import java.util.Scanner;
/**
 * QuadraticSolver calculates the roots of a quadratic equation.
 * 
 * @author Merrill Hall
 * @version 1.0
 */
public class QuadraticSolver {
    // equation coefficients
    private double a;
    private double b;
    private double c;
    
    /**
     * main method asks for the real coefficients a, b, and c in a 
     * quadratic equation of the following form:
     * 
     *      2
     *    ax  + bx + c = 0
     *    
     * main then calculates the two real roots of the equation.
     */
    public static void main(String[] args) {
        double inputA;
        double inputB;
        double inputC;
        Scanner keyInput = new Scanner(System.in);
        
        System.out.print("Enter the three quadratic equation coefficients, separated by spaces: ");
        inputA = keyInput.nextDouble();
        inputB = keyInput.nextDouble();
        inputC = keyInput.nextDouble();
        QuadraticSolver q = new QuadraticSolver(inputA, inputB, inputC);
        System.out.println(q.toString());
    }

    /**
     * Constructor for objects of class QuadraticSolver
     */
    public QuadraticSolver(double inputA, double inputB, double inputC) {
        // initialize radius
        a = inputA;
        b = inputB;
        c = inputC;
    }

    /**
     * toString calculates and returns the roots for the quadratic equation
     * in a string format
     */
    public String toString() {
        if (a == 0)
            return "\nThe equation is " + a + "x^2 + " + b + "x + " + c + "\n" +
                   "The first coefficient cannot be zero.\n";
                   
        double discriminant = b*b-4*a*c;
        if (discriminant < 0)
            return "\nThe equation " + a + "x^2 + " + b + "x + " + c + " does not give real results.\n" +
                   "The first  \"imaginary\" root is " + (-b/(2*a)) + " + " +
                           Math.sqrt(-discriminant)/(2*a) + "i\n" +
                   "The second \"imaginary\" root is " + (-b/(2*a)) + " - " +
                           Math.sqrt(-discriminant)/(2*a) + "i\n";
        else
            return "\nThe equation is " + a + "x^2 + " + b + "x + " + c + "\n" +
                   "The equation's first  real root is " + ((-b + Math.sqrt(discriminant))/(2*a)) + "\n" +
                   "The equation's second real root is " + ((-b - Math.sqrt(discriminant))/(2*a)) + "\n";
    }
}