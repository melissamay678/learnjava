public class StringConcatenation {
    public static void main(String[] args) {
        String s = "abc";
        String t = "DEF";
        int i = 99;
        double d = 9.999;
        
        //uncomment other choices to see it print out
        String u = s + t; //puts "abcDEF" into variable u
        //u = s + i;        //puts "abc99" into variable u
        //u = t + d;        //puts "DEF9.999"; into variable u
        
        System.out.println("The value in my int variable is " + i);
    }
}