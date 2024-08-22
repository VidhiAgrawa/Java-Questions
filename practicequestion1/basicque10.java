
// Take input of some length in meter and covert it to feet and inches.

package practicequestion1;
import java.util.*;
public class basicque10 {
    public static void main( String[] args ){
        Scanner sc = new Scanner( System.in );
        System.out.println("Enter the length :- ");
        int length = sc.nextInt();
        double inches = length*39.3701;
        System.out.println("length in feets :- " + inches);
        double feet = length*3.28084;
        System.out.println("length in feets :- " + feet);
        
    }
}
