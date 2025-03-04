import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check prime:- ");
        int num = sc.nextInt();
        if( num < 2 ){
            return;
        }
        for( int i = 2; i < num/2; i++ ){
            if( num%i == 0 ){
                System.out.println(num + " is not a prime number");
                return;
            }
        }
        System.out.println(num + " is a prime number");
        
    }
}
