public class VariableDisplay {
    public static void main(String[] args) {
        int myInteger = 0; // an int variable
        double myDouble1, myDouble2; // two double variables
        String myString; // a string
        
        myDouble1 = 1.2345;
        myDouble2 = 9.8765432;
        myString = "This is the string stored in myString";
        
        System.out.print("The value in my int variable is ");
        System.out.println(myInteger);
        System.out.print("The value in my double variables are ");
        System.out.print(myDouble1);
        System.out.print(" and ");
        System.out.println(myDouble2);
        System.out.print("The value in my String variable is \"");
        System.out.print(myString);
        System.out.println("\".");
    }
}