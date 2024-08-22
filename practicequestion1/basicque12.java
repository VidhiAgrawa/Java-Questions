// The total number of students in a class are 45 out of which 25 are boys. If 80% of the total students secured grade 'A' out of which 15 are boys, then write a program to calculate the total number of girls getting grade 'A'.

package practicequestion1;


public class basicque12 {
    public static void main( String[] args ){
        int totalStd = 45;
        int Aboys = 15;
        int totalPer = (80*45)/100 ;
        int Agirls = totalPer - Aboys;
        System.out.println("Boys that got A are :-" + Aboys);
        System.out.println("Girls that got A are :-" + Agirls);




    }
}
