import java.util.Scanner;

public class RectangleStats {

    private double height;
    private double width;

    public static void main(String[] args) {

        double inputHeight;
        double inputWidth;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the height and width of your rectangle, separated " +
            "by a space.");
        inputHeight = keyboard.nextDouble();
        inputWidth = keyboard.nextDouble();
        RectangleStats r = new RectangleStats(inputHeight, inputWidth);
        System.out.println(r.toString());
    }

    public RectangleStats(double h, double w) {
        height = h;
        width = w;
    }

    public String toString() {
        return "The rectangle's height is " + height + "\n" +
        "The rectangle's width  is " + width  + "\n" +
        "The rectangle's perimeter is " + (2.0 * (height + width)) + "\n" +
        "The rectangle's area is " + (height * width) + "\n";
    }

}