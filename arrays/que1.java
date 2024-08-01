package arrays;
import java.util.*;
public class que1 {
    public static void main(String[] args) {
        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);
        for( int i = 0; i < arr.length; i++ ){
            System.out.println("Enter the integer " + i );
            int b = sc.nextInt();
            arr[i] = b;
        }
        for( int j = 0; j < arr.length; j++ ){
            System.out.println( arr[j] );

        }
        
    }
}
