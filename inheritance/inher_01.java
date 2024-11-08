// Create a class with a method that prints "This is parent class" and its subclass with another method that prints "This is child class". Now, create an object for each of the class and call
// 1 - method of parent class by object of parent class
// 2 - method of child class by object of child class
// 3 - method of parent class by object of child class

class parent {
    public static void pa(){
        System.out.println("This is the parent class");
    }
}
class child extends parent{
    public static void ch(){
        System.out.println("This is the child class");
    }
}

public class inher_01 {
    public static void main(String[] args) {
        child chi = new child();
        parent par =  new parent();
        chi.ch();
        par.pa();
        chi.pa();
    }
}
