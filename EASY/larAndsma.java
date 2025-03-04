
public class larAndsma {
    public static void main(String[] args) {
        int arr[] = { 21, 43, 65, 87, 56,8726 };
        int left = 0;
        int right = arr.length-1;
        large(arr, left, right, arr[left]);
        small(arr, left, right, arr[right]);
        
    }
    public static int[] large(int arr[], int left, int right, int large) {
        if(left > right) {
            System.out.println("greater :- " + large);
            return arr;
        }
        if( large < arr[left] ){
            large = arr[left];
        }
        return large(arr, left + 1, right, large);
    }

    public static int[] small(int arr[], int left, int right, int small){
        if(left > right) {
            System.out.println("smaller :- " + small);
            return arr;
        }
        if( small > arr[right] ){
            small = arr[right];
        }
        return small(arr, left, right - 1, small);
    }
}
