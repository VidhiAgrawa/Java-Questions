// Write a function to check if a number is prime or not.


package functions;

import java.util.Scanner;

public class funcque6 {
    public static void prime(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :-");
        int a = sc.nextInt();
        for (int i = 2; i < a; i++) {
            if( a%i == 0 ){
                System.out.println("not prime");
            }
            else{
                System.out.println("prime");
            }
        }
    }
    public static void main(String[] args) {
        prime();
    }
}
