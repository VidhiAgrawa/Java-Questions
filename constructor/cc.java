package constructor;

class m{
    int a;
    int b;
    m( int a, int b ){
        System.out.println( a );
        System.out.println( b );
    }
}
class d extends m{
    int c;
    d( int c ){
        super( c, c );
        System.out.println( c );
    }
}

public class cc{
    public static void main(String[] args) {
        d obj = new d(10 );   
    }
}