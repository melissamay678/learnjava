import java.util.Scanner;
/**
 * TemperatureDriver runs and tests the Temperature class.
 * 
 * @author Melissa Mahlberg
 * @version 2.0
 */
public class TemperatureDriver {
    /**
     * main() reads two Fahrenheit temperatures and 
     * displays their Celsius and Kelvin equivalents.
     */
    public static void main(String[] args) {
        double inputTemperature = 0.0;
        Scanner keyboard = new Scanner(System.in); 
        Temperature t1;
        String temperatureType = "";

        System.out.print("Enter a temperature type (C for Celsius, " +
            "F for Fahrenheit, K for Kelvin): ");
        temperatureType = keyboard.next();
        if (temperatureType.equalsIgnoreCase("C") ||
        temperatureType.equalsIgnoreCase("F") ||
        temperatureType.equalsIgnoreCase("K")) {
            System.out.print("Enter a temperature: "); 
            inputTemperature = keyboard.nextDouble(); 
            t1 = new Temperature(temperatureType, inputTemperature);

            if (temperatureType.equalsIgnoreCase("F")) {
                System.out.println("You entered " + inputTemperature + 
                    " degrees Fahrenheit");
                System.out.println("which is " + t1.getDegreesCelsius() + 
                    " degrees Celsius"); 
                System.out.println("and " + t1.getDegreesKelvin() + 
                    " degrees Kelvin.");
            }

            else if (temperatureType.equalsIgnoreCase("C")) {
                System.out.println("You entered " + inputTemperature + 
                    " degrees Celsius");
                System.out.println("which is " + t1.getDegreesFahrenheit() + 
                    " degrees Fahrenheit"); 
                System.out.println("and " + t1.getDegreesKelvin() + 
                    " degrees Kelvin.");
            }

            else if (temperatureType.equalsIgnoreCase("K")) {
                System.out.println("You entered " + inputTemperature + 
                    " degrees Kelvin");
                System.out.println("which is " + t1.getDegreesFahrenheit() + 
                    " degrees Fahrenheit"); 
                System.out.println("and " + t1.getDegreesCelsius() + 
                    " degrees Celsius.");
            }

        }
        else {
            System.out.println("You entered an invalid temperature type: "
                + temperatureType);
            System.out.println("That was not a valid type. " +
                "Please try the program again.");

        }
    }
}