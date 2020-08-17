public class WrapperExamples {
    public static void main(String[] args) {
    
    String intString = "99";
    String floatString = "99.999";
    int intVariable;
    double doubleVariable;
    
    int i = 0;
    double d = 0.0;
    d = i; //this will work
    //i = d; //this won't work
    i = (int)d; //this will work too
    
    // stores 99 into intVariable then displays it
    intVariable = Integer.parseInt(intString);
    
    // stores 99.999 into doubleVariable
    doubleVariable = Double.parseDouble(floatString);
    
    // displays largest int Value
    System.out.println(Integer.MAX_VALUE);
    
    // sotres then dislays largest double value
    doubleVariable = Double.MAX_VALUE;
    
    System.out.println(intString);
    System.out.println(floatString);
    System.out.println(intVariable);
    System.out.println(doubleVariable);
    
    System.out.println(i);    
}
}

