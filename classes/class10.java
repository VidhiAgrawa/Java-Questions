// Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named ' Employee '. The output should be as follows:-
// Name        Year of joining        Address
// Robert            1994                64C - WallsStreat
// Sam                2000                68D - WallsStreat
// John                1999                26B - WallsStreat


package classes;

class employee {
    public static void emp() {
        String name = "Name";
        String year = "Year";
        String address = "Address";
        System.out.print( name + "\t" + year + "\t" + address );
        

    }
    
}

public class class10 {
    public static void main(String[] args) {
        employee obj = new employee();
        obj.emp();
    }
}
