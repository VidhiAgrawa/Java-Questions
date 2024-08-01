// Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.
 

package classes;


class student{
    public static void std() {
        int roll_num = 2;
        String name = "John";
        System.out.println( "name" + "  " + " roll number " );
        System.out.print( name + " :- " + roll_num );
    }
}

public class class2 {
    public static void main(String[] args) {
        student obj = new student();
        obj.std();
        
    }
}
