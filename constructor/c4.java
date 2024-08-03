// 
// Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a class named 'Triangle' without any parameter in its constructor.

// 
package constructor;

class triangle{
    triangle(){
        int l = 3;
        int b = 4;
        int h = 5;
        int area = 2 * l * b;
        int peri = l * b * h;
        System.out.println("Area of triangle :- " + area);
        System.out.println("Perimeter of triangle :- " + peri);
    }
}

public class c4 {
    public static void main(String[] args) {
        triangle obj = new triangle();

    }
}
