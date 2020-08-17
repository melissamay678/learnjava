public class VariableStory {
    public static void main(String[] args) {
        //Variable example
        System.out.println("There once was a man named George,");
        System.out.println("he was 70 years old. He really liked");
        System.out.println("the name Tom, but didn't like being 70.");
        System.out.println("Most of his friends were also 70, and one");
        System.out.println("of them was also named George.");
        System.out.println("\n");
        
        
        
        //Use variables to make changing info easier
        //create container for variable
        String characterName = "Ben";
        int characterAge = 35;
        
        System.out.println("There once was a man named " + characterName + ",");
        System.out.println("he was " + characterAge + " years old. He really liked");
        System.out.println("the name " + characterName + ", but didn't like being " + characterAge + ".");
        System.out.println("Most of his friends were also " + characterAge + ", and one");
        System.out.println("of them was also named " + characterName + ".");
        System.out.println("\n");
        
        
        //Assign different values to variables during different points in time.
        String personName = "Dave";
        int personAge = 20;
        
        System.out.println("There once was a man named " + personName + ",");
        System.out.println("he was " + personAge + " years old. He really liked");
        //Changed variables
        personName = "John";
        personAge = 50;
        
        System.out.println("the name " + personName + ", but didn't like being " + personAge + ".");
        System.out.println("Most of his friends were also " + personAge + ", and one");
        System.out.println("of them was also named " + personName + ".");
    }
}