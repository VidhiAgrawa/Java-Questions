
import java.util.Scanner;

public class rectangleAandP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of rectangle:- ");
        int length = sc.nextInt();
        System.out.println("Enter the breadth of rectangle:- ");
        int breadth = sc.nextInt();
        area(length, breadth);
        perimeter(length, breadth);

    }
    public static void area(int length, int breadth){
        int area = length*breadth;
        System.out.println("Area is:- " + area);
    }
    public static void perimeter(int length, int breadth){
        int perimeter = 2*(length+breadth);
        System.out.println("Perimeter is:- " + perimeter);
    }
}
