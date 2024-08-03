package constructor;
class x{
    int l,b;
    x(int l,int b){
        this.l=l;
        this.b=b;
    }
    public void area(){
        System.out.println(l*b);
    }
}
public class c1 {
    public static void main(String[] args) {
        x obj=new x(2,3);
        obj.area();
    }
}
