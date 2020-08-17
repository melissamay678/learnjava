public class StringExamples {
    public static void main(String [] args) {
        //Basic string
        System.out.println("Giraffe Academy");
        
        //String with quotes (backslash is an escape character)
        //Valid backslashes are \b \t \n \f \r \" \\
        System.out.println("Giraffe \"Academy\"");
        
        //Break long string and move to next line
        System.out.println("Giraffe Acadamy aaaaaaaaaaaaaaaaaaaa"
                            + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
                            
        //String Methods/Function
        String phrase = "Giraffe Acadamy";
        
        //converts to upper case
        System.out.println(phrase.toUpperCase());
        
        //converts to lower case
        System.out.println(phrase.toLowerCase());
        
        //gives length of string
        System.out.println(phrase.length());
        
        //tells true or false if it is in string
        System.out.println(phrase.contains("Acadamy"));
        
        System.out.println(phrase.contains("dog"));
        
        //tells character at the index of string starting at 0
        System.out.println(phrase.charAt(6));
        
        //tells what index the character of string
        System.out.println(phrase.indexOf("a"));
        
        //tells what the last index the repeated character is in a string
        System.out.println(phrase.lastIndexOf("a"));
        
        //tells text including and after the index selected
        System.out.println(phrase.substring(8));
        
        //pass in multiple parameters into method
        //first index included, second index not included
        System.out.println(phrase.substring(8, 11));
        
        //grab first word - mixing methods
        System.out.println( phrase.substring(0, phrase.indexOf(" ")) );
    }
}