// Create a class named 'Rectangle' with two data members 'length' and 'breadth' and two methods to print the area and perimeter of the rectangle respectively. Its constructor having parameters for length and breadth is used to initialize length and breadth of the rectangle. Let class 'Square' inherit the 'Rectangle' class with its constructor having a parameter for its side (suppose s) calling the constructor of its parent class as 'super(s,s)'. Print the area and perimeter of a rectangle and a square.

import string.stg1;

class rectangle{
    int l;
    int b;
    rectangle( int l, int b ){
        this.l = l;
        this.b = b;
    }
    void area(){
        int ar = 2 * l * b;
        System.out.println("Area of rectangle :- " + ar);
    }
    void perimeter(){
        int peri = l * b;
        System.out.println("Perimeter of rectangle :- " + peri);
    }
}
class square extends rectangle{
    int s;
    square(int l , int b){
        super(l, b);
        this.s = l;
    }
    void area2(){
        int ar = s * s;
        System.out.println("Area of square :- " + ar);
    }
    void perimeter2(){
        int peri = 4 * s;
        System.out.println("Perimeter of square :- " + peri);
    }
}

public class inher_03 {
    public static void main(String[] args) {
        square sq = new square(5, 2);
        sq.area();
        sq.perimeter();
        sq.area2();
        sq.perimeter2();
    }
}
