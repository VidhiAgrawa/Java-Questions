// Write a function to check if a number is even or not.


package functions;

import java.util.Scanner;

public class funcque5 {
    public static void even(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int a = sc.nextInt();
        if ( a%2 ==0 ){
            System.out.println("the given number is even");
        }
        else{
            System.out.println("the given number is odd");

        }

    }
    public static void main(String[] args) {
        even();
    }
}
