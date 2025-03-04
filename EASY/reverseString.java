
public class reverseString {
    public static void main(String[] args) {
        String name = "vidhiagrawal";
        String[] str = name.split("");
        for (int i = 0, j = str.length-1; i <= str.length/2 && j >=0; i++, j--) {
            String n = str[i];
            str[i] = str[j];
            str[j] = n;
            
        }
        for (int j = 0; j < str.length; j++) {
            System.out.print(str[j]+"\t");
            
        }
    }
}
