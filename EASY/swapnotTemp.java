public class swapnotTemp {
    public static void main(String[] args) {
        int num = 30;
        int num2 = 40;

        num = num + num2;
        num2 = num - num2;
        num = num - num2;
        System.out.println(num + "\t" + num2);
    }
}
