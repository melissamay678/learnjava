//only purpose is to try out our TextWriter class - main() means it is executable.

public class TextWriterDriver {
    public static void main(String[] args) {
        
        //a variable named tw1 whose type is TextWriter - TextWriter is a constructor
        TextWriter tw1;
        
        //creating TextWriter() object
        tw1 = new TextWriter();
        
        //testing setTextToDisplay method
        tw1.setTextToDisplay("This line is from my first Java object!");
        
        //testing display method
        tw1.display();
        
        //testing second constructor
        //declares variable (type variableName) : assignment connects the variable 
        //to the object = : creates new object from second 
        //constructor (new objectName/constructor)
        TextWriter tw2 = new TextWriter("And this line is from my second object.");
        
        //testing getTextToDisplay() method - calls method for object tw2 and 
        //retrieves text and prints
        System.out.println(tw2.getTextToDisplay());
        
        TextWriter tw3 = new TextWriter("I am a great programmer!");
        tw3.display();
        tw3.clearTextToDisplay();
        System.out.println("Next I am calling tw3.display() and nothing should show up.");
        tw3.display();
        System.out.println("It worked!");
    }
}