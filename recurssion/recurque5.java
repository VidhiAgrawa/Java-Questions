package recurssion;

import java.util.Scanner;

public class recurque5 {
    public static int sum( int a, int num ){
        if( a > num ){
            return 0;
        }
        return a + sum( a + 1, num );
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :- ");
        int num = sc.nextInt();
        // multi(1 , num);
        System.out.println( sum(0 , num) );
    }
}
