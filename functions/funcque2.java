// Write a function to calculate area and circumference of a circle.


package functions;

import java.util.Scanner;

public class funcque2 {
    public static void circle() {
        double p = Math.PI;
        Scanner sc = new Scanner( System.in );
        System.out.println("Enter the valur for radius r :-");
        int r = sc.nextInt();
        System.out.println("circumference of the numbers :-" + 2*(p*r));
        System.out.println("Area of the numbers :-" + (p*r*r));
    }
    public static void main(String[] args) {
        circle();
    }
}
