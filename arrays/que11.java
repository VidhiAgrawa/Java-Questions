// Write a program to check if elements of an array are same or not if read from front or back. E.g.- 23151532


package arrays;

public class que11 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 4, 5 };
        for (int i = 0; i < arr.length; i++) {
            int arr2 = arr[i];
            boolean say = false;
            for (int j = 0; j < arr.length; j++) {
                if( i != j ){
                    if( arr2 == arr[j] ){
                        say = true;

                    }
                }
            }
            System.out.println(say);
        }
    }
}
