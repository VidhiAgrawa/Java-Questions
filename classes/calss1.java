// Write a program to print the area of a rectangle by creating a class named 'Area' having two methods. First method named as 'setDim' takes length and breadth of rectangle as parameters and the second method named as 'getArea' returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard.
package classes;

import java.util.Scanner;

class area{
    public static void setdim(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the length :- ");
        int l = sc.nextInt();
        System.out.println(" Enter the width :- ");
        int w = sc.nextInt();
        System.out.println( "Perimeter of Rectangle :-" + 2*( l + w ) );
    }
    public static void getdim(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the length :- ");
        int l = sc.nextInt();
        System.out.println(" Enter the width :- ");
        int w = sc.nextInt();
        System.out.println( "Area of Rectangle :-" +  (l + w)  );    
    }
}


public class calss1 {
    public static void main(String[] args) {
        area obj = new area();
        obj.setdim();
        obj.getdim();
    }
}
