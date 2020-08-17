import java.util.Scanner;

public class MadLibGame {
    public static void main(String [] args) {
    
        Scanner KeyboardInput = new Scanner(System.in);
        
        System.out.print("Enter a color: ");
        String color = KeyboardInput.nextLine();
        System.out.print("Enter a plural noun: ");
        String pluralNoun = KeyboardInput.nextLine();
        System.out.print("Enter a celebrity: ");
        String celebrity = KeyboardInput.nextLine();
        
        System.out.println("Roses are " + color + "\n"
                          + pluralNoun + " are blue \n"
                          + "I love " + celebrity);
    }
}