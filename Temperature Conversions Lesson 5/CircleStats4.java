import java.util.Scanner;

public class CircleStats4 {
    private double radius;
    
    public static void main(String[] args) {
        double inputRadius;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter the radius for your circle: ");
        inputRadius = keyboard.nextDouble();
        CircleStats4 c = new CircleStats4(inputRadius);
        System.out.println(c.toString());
    }
    
    public CircleStats4(double r) {
        radius = r;
    }
    
    public String toString() {
        return "The circle's radius is " + radius + "\n" +
               "The circle's circumference is " + (2.0 * Math.PI * radius) + "\n" +
               "The circle's area is " + (Math.PI * radius * radius) + "\n" +
               "The surface area of a sphere with the same radius is " + (4.0 * Math.PI * radius * radius) + "\n";
    
    }

}