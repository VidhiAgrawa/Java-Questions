// Add two distances in inch-feet by creating a class named 'AddDistance'.
package classes;

import java.util.*;

class AddDistance{
    public static void dist() {
        Scanner sc = new Scanner( System.in );
        System.out.println("Enter the Distance1 :- ");
        int distance1 = sc.nextInt();
        System.out.println("Enter the Distance2 :- ");
        int distance2 = sc.nextInt();
        double inches = distance1*39.3701;
        System.out.println("distance1 in feets :- " + inches);
        double inches2 = distance2*39.3701;
        System.out.println("distance2 in feets :- " + inches);
        
        double distance = inches + inches2;
        System.out.println(distance);
    }
}

public class class11 {
    public static void main(String[] args) {
        AddDistance obj = new AddDistance();
        obj.dist();
    }
}
