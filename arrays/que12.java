
// Take an array of 10 elements. Split it into middle and store the elements in two dfferent arrays. E.g.-
// INITIAL array :58241315639881178
// After spliting :58241315639881178

package arrays;

public class que12 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int half[] = new int[3];
        int otherHalf[] = new int[3];
        int j = 0;
        for( int i = 0; i < arr.length; i++ ){
            if( i < arr.length/2 ){
                half[i] = arr[i];
            }
            else{
                otherHalf[j] = arr[i];
                j++; 
            }
        }
        for (int i = 0; i < half.length; i++) {
            System.out.print(half[i] + "\t");
        }
        System.out.println("");
        for (int i = 0; i < otherHalf.length; i++) {
            System.out.print(otherHalf[i] + "\t");
        }
    }
}
