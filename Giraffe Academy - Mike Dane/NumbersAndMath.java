public class NumbersAndMath {
    public static void main(String [] args) {
        
        //Java automatically calculates math in parens.
        System.out.println(3 + 4);
        
        System.out.println(3 - 4);
        
        System.out.println(3 * 4);
        
        //integers will print out only integers not decimals as answer
        System.out.println(3 / 4);
        
        System.out.println(3.0 / 4.0);
        
        //modulous variable will print out only the remainder from division
        System.out.println(10 % 3);
        
        
        int myInt = 3;
        double myDouble = 5.5;
        
        System.out.println( 5 + myInt );
        
        //math using integers and doubles will print out answer in double
        System.out.println( myDouble + myInt );
        
        //Methods
        //absolute value
        System.out.println( Math.abs(myDouble) );
        
        //exponents Math.pow(My variable, power to multiply by)
        System.out.println( Math.pow(myInt, 3) );
        
        //square root 
        System.out.println( Math.sqrt(36) );
        
        //returns smallest number of two numbers you put in method
        System.out.println( Math.min(2, 6) );
        System.out.println( Math.min(2, myInt) );
        
        //returns larger number of two numbers you put in method
        System.out.println( Math.max(2, myInt) );
        
        //Round decimal number up or down to whole number
        System.out.println( Math.round(myDouble) );
        
        //Random number between 0.0 (inclusive) and 1.0 (exclusive)
        System.out.println( Math.random() );
    }
}