// Write a program to compare if the two strings entered by user are equal or not without using predefined String functions.



package string;

public class stg5 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hillo";

        if( s1.length() == s2.length() ){
            System.out.println(" length of both the strings are equal ");         
            for (int i = 0; i < s1.length(); i++) {
                if( s1.charAt(i) != s2.charAt(i) ){
                    System.out.println(" characters of both the string are not same ");  
                }    
            }
        }
        else{
            System.out.println(" length of both the strings are not equal ");
        }
    }
}
