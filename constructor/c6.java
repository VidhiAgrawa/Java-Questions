// Write a program to print the area of two rectangles having sides (4,5) and (5,8) respectively by creating a class named 'Rectangle' with a method named 'Area' which returns the area and length and breadth passed as parameters to its constructor.


package constructor;

class rectangle{
    rectangle( int l, int b ){    
        System.out.println(" area of rectangle " + area( l, b ));
    }
    public static int area( int l, int b ) {
        return l * b;
    }
}

public class c6 {
    public static void main(String[] args) {
        rectangle obj = new rectangle(4, 5);
        rectangle obj2 = new rectangle(5, 8);
    }
}
