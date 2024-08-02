// print table of nmumber

package recurssion;

import java.util.Scanner;

public class recurque3 {
    public static void table(int a, int b ){
        if( a > 10 ) return;
        System.out.println( b + " X " + a + " = " + a * b);
        table( a + 1, b );
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :- ");
        int num = sc.nextInt();
        table(1, num );
    }
}
