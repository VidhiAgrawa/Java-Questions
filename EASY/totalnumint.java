
public class totalnumint {
    public static void main(String[] args) {
        // int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        // System.out.println(arr.length);
        // System.out.println(String.valueOf(num).length());
        int num = 275743;
        int t = 0;
        int get = total(num, t);
        System.out.println("total:- " + get);
        
        
    }
    public static int total(int num, int t){
        if(num == 0) return t;
        return total(num/10, ++t);

    }
}
