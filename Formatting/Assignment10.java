import java.util.Scanner;
import java.math.BigInteger;
import java.math.BigDecimal;
/**
 * Assignment10 uses the Scanner next...() methods to determine type and then the
 * printf() method for format the output.
 * 
 * @author Merrill Hall
 * @version 1.0
 */
public class Assignment10 {
    /**
     * The main() method reads and displays different types of data.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);  // keyboard input object
        byte by = 0;  // variable for byte values
        short sh = 0;  // variable for short values
        int i = 0;  // variable for int values
        long l = 0;  // variable for long values
        
        BigInteger bi = BigInteger.ZERO;  // variable for BigInteger values
        
        BigDecimal bd = BigDecimal.ZERO;  // variable for BigDecimal values
        final BigDecimal maxFloat = new BigDecimal(Float.MAX_VALUE);  // BigDecimal constant
        final BigDecimal minFloat = new BigDecimal(Float.MIN_VALUE);  // BigDecimal constant
        final BigDecimal maxDouble = new BigDecimal(Double.MAX_VALUE);  // BigDecimal constant
        final BigDecimal minDouble = new BigDecimal(Double.MIN_VALUE);  // BigDecimal constant
        
        float f = 0.0f;  // variable for float values
        double d = 0.0;  // variable for double values
        boolean bo = false;  // variable for boolean values
        String st = "";  // variable for String values
        
        while ( ! st.equalsIgnoreCase("quit") ) {  // keep going until the user says to quit
            System.out.print("Enter anything (\"Quit\" to quit): ");  // prompt for data
            if (in.hasNextByte()) { // test for byte value
                by = in.nextByte();
                System.out.printf("The data type is %-10s and its value is %26d%n","byte",by);
            }
            else if (in.hasNextShort()) {  // test for short value
                sh = in.nextShort();
                System.out.printf("The data type is %-10s and its value is %,26d%n","short",sh);
            }
            else if (in.hasNextInt()) {  // test for int value
                i = in.nextInt();
                System.out.printf("The data type is %-10s and its value is %,26d%n","int",i);
            }
            else if (in.hasNextLong()) { // test for long value
                l = in.nextLong();
                System.out.printf("The data type is %-10s and its value is %,26d%n","long",l);
            }
            else if (in.hasNextBigInteger()) {  // test for larger integers
                bi = in.nextBigInteger();
                System.out.printf("The data type is %-10s and its value is %,26d%n","BigInteger",bi);
            }
            else if (in.hasNextBigDecimal()) {  // test for floating point
                bd = in.nextBigDecimal();
                if ((bd.compareTo(minFloat) > 0) && 
                    (bd.compareTo(maxFloat) < 0)) {  // test for float
                    f = bd.floatValue();
                    System.out.printf("The data type is %-10s and its value is %,26g%n","float",f);
                }
                else if ((bd.compareTo(minDouble) > 0) && 
                    (bd.compareTo(maxDouble) < 0)) {       // test for double
                    d = bd.doubleValue();
                    System.out.printf("The data type is %-10s and its value is %,26g%n","double",d);
                }
                else  // larger floating point
                    System.out.printf("The data type is %-10s and its value is %,26g%n","BigDecimal",bd);
            }
            else if (in.hasNextBoolean()) {  // test for boolean
                bo = in.nextBoolean();
                System.out.printf("The data type is %-10s and its value is %-26b%n","boolean",bo);
            }
            else {  // everything else is a String
                st = in.next();
                System.out.printf("The data type is %-10s and its value is %-26s%n","String",st);
            }
        }
        System.out.println("\nThanks for playing!  Program has ended.");
    }
}