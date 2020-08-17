import java.util.Scanner;

public class GetInput {
    public static void main(String [] args) {
        
        //Scanner
        Scanner keyboardInput = new Scanner(System.in);
        //print out "Enter Your Name: "
        System.out.print("Enter Your Name: ");
        //grabing the name
        //.nextLine will print out string
        //.nextInt will print out integer
        String name = keyboardInput.nextLine();
        
        System.out.print("Enter Your Age: ");
        int age = keyboardInput.nextInt();
        
        System.out.println("Hey " + name + ", you are " + age + " years old!");
    }
}