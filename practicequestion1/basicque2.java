// Write a program to input the value of the radius of a circle from keyboard and then calculate its perimeter and area.


package practicequestion1;

import java.util.*;
public class basicque2 {
    public static void main(){
        double p = Math.PI;
        Scanner sc = new Scanner( System.in );
        System.out.println("Enter the valur for radius r :-");
        int r = sc.nextInt();
        System.out.println("Parameter of the numbers :-" + 2*(p*r));
        System.out.println("Area of the numbers :-" + (p*r*r));
    
    }
}
