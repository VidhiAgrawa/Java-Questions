// Find largest and smallest elements of an array.


package arrays;

public class que9 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int a ;
        for( int i = 0; i < arr.length; i++ ){
            a = arr[i];
            if( a < arr.length ){
                System.out.println(a + " is smallest ");
                a++;
            }
            else{
                
                System.out.println(a +" is greatest");
            }
        }
    }
}
