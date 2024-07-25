// Write a program to find the length of the string "refrigerator".


package string;

public class stg3 {
    public static int size(String name) {
        int length = 0 ;
        char arr[] = name.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            length++;
        }
        return length;
        
    }
    public static void main(String[] args) {
        String name = "refrigerator";
        int length = size(name);
        System.out.println(" The length of string is :- " + length);
        // System.out.println( name.length());
        // int length = length();
        
    }
}
