
public class reverseArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        for (int i = 0; i <= arr.length/2; i++) {
            for (int j = arr.length - 1; j >= 0; j--) {
                int n = arr[j];
                arr[j] = arr[i];
                arr[i] = n;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
