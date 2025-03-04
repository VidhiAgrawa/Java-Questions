import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to check palindrome:- ");
        String str = sc.nextLine();
        int left = 0;
        int right = str.length() - 1;
        if(palin(str, right, left)){
            System.out.println(str + " is palindrome");
        }
        else{
            System.out.println(str + " is not paloindrome");
        }
        
    }
    public static boolean palin(String str, int right, int left){
        if( left >= right ) return true;
        if( str.charAt(left) != str.charAt(right) ){
            return false;
        }
        return palin(str, right-1, left+1);

    }
}
