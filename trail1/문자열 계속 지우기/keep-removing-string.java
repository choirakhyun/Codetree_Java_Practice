import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        char[] arr = s.toCharArray();
        
        while (s.contains(t)) {
            s = s.replace(t, "");
        }
        System.out.print(s);
    }
}