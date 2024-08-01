// Write a program to find the product of all elements of an array.


package arrays;

public class que6 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int a = 1;
        for( int i = 0; i < arr.length; i++ ){
            a = a * arr[i];
        }
        System.out.println("sum of all element is :- " + a );
    }
}
