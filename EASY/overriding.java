class student{
    public static void name(){
        System.out.println("vidhi");
    }
}
class parent extends student{
    public static void name(){
        System.out.println("vijayshree");
    }

}

public class overriding {
    public static void main(String[] args) {
        parent p = new parent();
        student std = new student();
        p.name();
        std.name();
    }
}
