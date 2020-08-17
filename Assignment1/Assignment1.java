import java.util.Scanner;
/**
 * Assignent1 reads an integer month and uses two switches and an enumeration to 
 * convert it to a text month.
 * 
 * @author Merrill Hall
 * @version 1.0
 */
public class Assignment1 {
    public static void main(String[] args) {
        int monthNum = 0;
        Mo monthEnum = Mo.JAN;
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
            case 1:  monthEnum = Mo.JAN; break;
            case 2:  monthEnum = Mo.FEB; break;
            case 3:  monthEnum = Mo.MAR; break;
            case 4:  monthEnum = Mo.APR; break;
            case 5:  monthEnum = Mo.MAY; break;
            case 6:  monthEnum = Mo.JUN; break;
            case 7:  monthEnum = Mo.JUL; break;
            case 8:  monthEnum = Mo.AUG; break;
            case 9:  monthEnum = Mo.SEP; break;
            case 10: monthEnum = Mo.OCT; break;
            case 11: monthEnum = Mo.NOV; break;
            case 12: monthEnum = Mo.DEC; break;
            default: System.out.println("That was not a valid month. Try running the program again.");
                     System.exit(2);
        }
        
        switch (monthEnum) {
            case JAN:  System.out.println("The month is January"); break;
            case FEB:  System.out.println("The month is February"); break;
            case MAR:  System.out.println("The month is March"); break;
            case APR:  System.out.println("The month is April"); break;
            case MAY:  System.out.println("The month is May"); break;
            case JUN:  System.out.println("The month is June"); break;
            case JUL:  System.out.println("The month is July"); break;
            case AUG:  System.out.println("The month is August"); break;
            case SEP:  System.out.println("The month is September"); break;
            case OCT:  System.out.println("The month is October"); break;
            case NOV:  System.out.println("The month is November"); break;
            case DEC:  System.out.println("The month is December"); break;
        }
    }
}
