class student{
    public static void name(){
        System.out.println("vidhi");
    }
    public static void name(int age){
        System.out.println(age);
    }
}

public class overloading {
    public static void main(String[] args) {
        student std = new student();
        std.name();
        std.name(20);
    }
}
