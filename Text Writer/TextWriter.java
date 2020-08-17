
/**
 * Write a description of class TextWriter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TextWriter {
   // instance variable
   //<access modifier> <data type> <variable name>;
   private String textToDisplay; // the text to be displayed
   
   //constructor 1 - used to access objects
   public TextWriter() {
       textToDisplay = "";
   }

   //constructor 2 - used to access objects
   public TextWriter(String inputText) {
       textToDisplay = inputText;
   }
   //<who can see it> <tell Java what type of value (if any) this method should return 
   //to anyone who calls it> <Function()/Method() name - (the action)> <parameter list -
   //each parameter is separated by camma and has type and name>
   
   //Set Method
   public void setTextToDisplay(String inputText) {
       textToDisplay = inputText;
   }
   
   //Get Method
   public String getTextToDisplay() {
       //tells Java what to return to caller
       return textToDisplay;
   }
   
   //Clear Method
   public void clearTextToDisplay() {
       textToDisplay = "";
   }
   
   //Display Method
   public void display() {
       System.out.println(textToDisplay);
   }
}
