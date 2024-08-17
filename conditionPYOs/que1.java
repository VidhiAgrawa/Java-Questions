// Take values of length and breadth of a rectangle from user and check if it is square or not.



package conditionPYOs;

import java.util.Scanner;
import java.util.*;
public class que1 {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length :-");
        int length = sc.nextInt();
        System.out.println("Enter the width :-");
        int width = sc.nextInt();

        if( length == width ){
            System.out.println("According to give l and w the shape is Square");
        }
        else{
            System.out.println("give l and w is not in the shape of Square");

        }

    }
}
