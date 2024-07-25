// Write a program to print every character of a string entered by user in a new line using loop.


package string;

public class stg2 {
    public static void main(String[] args) {
        String name = "hello";
        for (int i = 0; i < name.length(); i++) {
            System.out.println( name.charAt(i) );
        }
    }
}
