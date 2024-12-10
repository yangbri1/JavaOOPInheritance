public class Main {
    // standard static main() method w/ no return type
    public static void main(String[] args) {
        // assign a KPOP 3rd gen group to 'genThree' variable
        String genThree = "Twice";

        // create a Parent obj by assigning 'p' to Parent Constructor
        Parent p = new Parent(genThree);

        // access 'name' variable in 'Parent' class using dot notation as its an obj & assign to custom value
        // p.name = "Bruno Mars";

        // call 'greeting' method using dot notation
        p.greeting();

        // initialize group's fandom name to 'fans'
        String fans = "Once Thrice";

        // create an instance of Child class obj
        Child c = new Child(genThree, fans);

        // invoke 'greeting' method from 'Child' class in which inherits it via 'extends' to 'Parent' class
        c.greeting();   // this is an inherent trait by 'Parent'

        // assign name to 'descendent' variable in 'Child' class
        // c.descendent = "Lady Gaga";
        // call forth 'Child' class own 'spelling()' method
        c.spelling();
    }
}
