// Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a class named 'Triangle' with constructor having the three sides as its parameters.


package constructor;

class triangle{
    int l;
    int b;
    int h;
    triangle(){
        this.l = 3;
        this.b = 4;
        this.h = 5;
        double area = (0.5 * l) * b;
        int peri = l * b * h;
        System.out.println("Area of triangle :- " + area);
        System.out.println("Perimeter of triangle :- " + peri);
    }
}

public class c5 {
    public static void main(String[] args) {
        triangle obj = new triangle();
    }
}
