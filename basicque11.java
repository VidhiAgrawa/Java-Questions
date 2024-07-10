// Write a program to convert Fahrenheit into Celsius.


package practicequestion1;
import java.util.*;
public class basicque11 {
    public static void main( String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a certain Fahrenheit for convertion :- ");
        int Fahrenheit =  sc.nextInt();
        double celcius = (Fahrenheit - 32)*5/9 ;
        System.out.println("The resultant Celcius is :- " + celcius);
    }
}
