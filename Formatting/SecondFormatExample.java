/**
 * SecondFormatExample provides more examples of printf() formatting.
 * 
 * @author Merrill Hall
 * @version 1.0
 */
public class SecondFormatExample {
    /**
     * The main() method displays several format options for numbers.
     */
    public static void main(String[] args) {
        System.out.printf("Format is %%10f:    %10f%n",123.45);
        System.out.printf("Format is %%10.0f:  %10.0f%n",123.45);
        System.out.printf("Format is %%10.1f:  %10.1f%n",123.45);
        System.out.printf("Format is %%10.2f:  %10.2f%n",123.45);
        System.out.printf("Format is %%10.3f:  %10.3f%n",123.45);
        System.out.printf("Format is %%010.3f: %010.3f%n",123.45);
    }
}