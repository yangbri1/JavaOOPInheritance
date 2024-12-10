/* IMPORTANT: Child subclass is more specific than overarching Parent super class */

// import 'Random' class from java.util package
import java.util.Random;

// using 'extends' keyword to inherit some traits from 'Parent' super class
public class Child extends Parent {
    // declare String variable 'descendent' to later hold name of child
    String descendent;
    
    // Required: 'Child' Constructor to initialize 'descendent'
    // IMPORTANT: This step necessary to use String.length() method otw would yield 'NullPointerException' from trying to access 'null'
    public Child(String name, String descendent){

        // (MUST BE 1st: Constructor to inherits 'name' from 'Parent' class
        // https://stackoverflow.com/questions/23889811/java-constructor-in-class-cannot-be-applied-to-given-types
        super(name);

        // https://stackoverflow.com/questions/32176463/in-java-can-super-be-used-to-call-any-parent-method-or-just-the-parent-constru
        
        /* 
        IMPORTANT: super.methodName() -- to call parent's method -- access modifiers should be set to "public" ("private" can't access)
        */

        // initialize instance variable 'descendent' (point w/ 'this') to input arg 'descendent'
        this.descendent = descendent;
        
    }

    // create an instance of 'Random' obj
    Random randomGenerate = new Random();

    public String rollGo(){
        // generate a random int b/t [0, descendent.length())
        int roll = randomGenerate.nextInt(descendent.length());

        // randomly 'roll' some length of 'descendent' name
        String offspringPart = descendent.substring(0, roll);

        return offspringPart;
    }
    
    // 'Child' method spelling() 
    public void spelling(){
        // call 'rollGo()' method from above to retrieve part of fan's name
        String fanName = rollGo();

        // String array w/ 'descendent' name separated out using String .split() method
        String[] offspringAry = fanName.split("");

        // indicate to user what is about to come
        System.out.println("It's spelled like this!!");

        // for-each loop to print out each elem in 'offspringAry' (char of descendent name)
        for(String letter : offspringAry){
            // if the letter is a whitespace " " -- prefer .equals() method to compare value (as '==' may be finnicky if points to different mem address in String pool)
            if(letter.equals(" ")){
                // replace it w/ this on console when logging out to output stream
                System.out.print("(Nothing here D:) ");
            }
            // otherwise ...
            else{
                // act of printing 'descendent' name letter by letter
                System.out.print(letter + "... ");
            }
            
        }
    }
    
}
// Side Note: Since 'Child' class "extends" from 'Parent' class it also inherits variable 'name' & method 'greetings()' as a plus
