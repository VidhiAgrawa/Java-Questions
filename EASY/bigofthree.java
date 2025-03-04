
public class bigofthree {
    public static void main(String[] args) {
        int arr[] = { 23, 45, 787 }; 
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            if(n < arr[i]){
                n = arr[i];
            }
        }
        System.out.println("greater " + n);
        
    }
}
