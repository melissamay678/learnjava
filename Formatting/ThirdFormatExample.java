import java.util.Calendar;
import java.util.GregorianCalendar;
import static java.util.Calendar.*;
/**
 * ThirdFormatExample provides more examples of printf() formatting.
 * 
 * @author Merrill Hall
 * @version 1.0
 */
public class ThirdFormatExample {
    /**
     * The main() method displays several Date and time options
     */
    public static void main(String[] args) {
        Calendar c = new GregorianCalendar();
        System.out.printf("Today is %tA, %1$tB %1$te, %1$tY.%n", c);
        System.out.printf("The time is %tl:%1$tM:%1$tS.%1$tL %1$Tp.%n", c);
    }
}