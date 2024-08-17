// Create an abstract class 'Parent' with a method 'message'. It has two subclasses each having a method with the same name 'message' that prints "This is first subclass" and "This is second subclass" respectively. Call the methods 'message' by creating an object for each subclass.
package abstraction;

abstract class parent{
    abstract public void message();
}
class child1 extends parent{
    public void message() {
        System.out.println("this is first subclass");
    }
}
class child2 extends parent{
    public void message() {
        System.out.println("this is second subclass");
    }
}


public class abstract1 {
    public static void main(String[] args) {
        child1 ch1 = new child1();
        child2 ch2 = new child2();
        ch1.message();
        ch2.message();
    }   
}
