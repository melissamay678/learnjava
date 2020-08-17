import java.util.Scanner;
/**
 * QuadraticSolver calculates the real roots of a valid quadratic equation.
 *
 * @author Melissa Mahlberg
 * @version 1.0 - 07/07/2020
 */
//creates class
public class QuadraticSolver {
    //creates class variables
    private double a;
    private double b;
    private double c;
    private double root1;
    private double root2;
    
    //method to execute code
    public static void main(String[] args) {
        //creates input variables to receive information from keyboard
        //and assigns start value
        double aInput = 0.0;
        double bInput = 0.0;
        double cInput = 0.0;
        //creates a way for user to input information through keyboard
        Scanner keyboard = new Scanner(System.in);
        //Asks user to enter intormation
        System.out.print("Enter the three quadratic coefficients " +
        "(a, b, and c) separated by spaces: ");
        //puts what the user entered from keyboard into input variables
        aInput = keyboard.nextDouble();
        bInput = keyboard.nextDouble();
        cInput = keyboard.nextDouble();
        //connects the class to the input variables????
        QuadraticSolver qs = new QuadraticSolver(aInput, bInput, cInput);
        //???????
        qs.solve();
        //print out answers to equations
        System.out.println("The first root is " + qs.getRoot1());
        System.out.println("The second root is " + qs.getRoot2());
    }
    
    //constructor - create the QuadraticSolver object
    //@param a the coefficient for the quadratic term (x^2)
    //@param b the coefficient for the linear term (x)
    //@param c the coefficient for the constant term
    public QuadraticSolver(double aInput, double bInput, double cInput) {
        root1 = (-b + Math.sqrt(b*b-4*a*c))/(2*a);
        root2 = (-b - Math.sqrt(b*b-4*a*c))/(2*a);
    }
    
    //return first root of equation
    //@return the eqation's first root
    public double getRoot1() {
        return root1;
    }
    
    //return second root of equation
    //@return the eqation's second root
    public double getRoot2() {
        return root2;
    }
}
