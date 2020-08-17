/**
 * MathFormatting provides a solution to an exercise in the lesson.
 * 
 * @author Merrill Hall
 * @version 1.0
 */
public class MathFormatting {
    /**
     * The main() method calculates the cube root of the first 25
     * positive integers and formats them to display 5 decimal
     * places.
     */
    public static void main(String[] args) {
        int i = 2;

        while (i <= 50) {
            System.out.printf("The cube root of %2d is %7.5f%n",
                i, Math.cbrt(i));
            i += 2;
        }
    }
}