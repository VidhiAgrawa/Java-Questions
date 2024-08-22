// If the marks of Robert in three subjects are 78,45 and 62 respectively (each out of 100 ), write a program to calculate his total marks and percentage marks.


package practicequestion1;

public class basicque8 {
    public static void main( String[] args ){
        int Eng = 78;
        int Sci = 45;
        int Hindi = 62;
        int totalMarks = ( Eng + Sci + Hindi ); 
        System.out.println( "Total marks Robert obtained :- " + totalMarks);
        int percent = (totalMarks * 100) / 300;
        System.out.println( "Total percent Robert obtained :- " + percent);
    }
}
