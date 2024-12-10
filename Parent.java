public class Parent {
    // 'Parent' class' field/state/variable
    public String name;

    // 'Parent' class Constructor
    public Parent(String name){
        // assign 'name' field w/ 'name' argument's value
        this.name = name;
    }

    // 'greeting()' method of 'Parent' class
    public void greeting() {
        System.out.println("One in a million, hello we are " + name);
    }
}