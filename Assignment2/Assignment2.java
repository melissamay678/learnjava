import java.util.Scanner;
/**
 * Assignent1 reads an integer month and uses a switch and an enumeration to 
 * convert it to a text month.
 * 
 * @author Merrill Hall
 * @version 1.0
 */
public class Assignment2 {
    public static void main(String[] args) {
        int monthNum = 0;
        Month monthEnum = Month.JAN;
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a numeric month (1-12): ");
        if (in.hasNextInt()) {
            monthNum = in.nextInt();
        }
        else {
            System.out.println("That was not a numeric entry. Try running the program again.");
            System.exit(1);
        }
        
        switch (monthNum) {
            case 1:  monthEnum = Month.JAN; break;
            case 2:  monthEnum = Month.FEB; break;
            case 3:  monthEnum = Month.MAR; break;
            case 4:  monthEnum = Month.APR; break;
            case 5:  monthEnum = Month.MAY; break;
            case 6:  monthEnum = Month.JUN; break;
            case 7:  monthEnum = Month.JUL; break;
            case 8:  monthEnum = Month.AUG; break;
            case 9:  monthEnum = Month.SEP; break;
            case 10: monthEnum = Month.OCT; break;
            case 11: monthEnum = Month.NOV; break;
            case 12: monthEnum = Month.DEC; break;
            default: System.out.println("That was not a valid month. Try running the program again.");
                     System.exit(2);
        }
        
        System.out.println("The month is " + monthEnum.getMonth());
    }
}
