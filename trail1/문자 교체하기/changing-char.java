import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int len = t.length();
        char[] arrs = s.toCharArray();
        char[] arrt = t.toCharArray();

        for (int i = 0; i < 2; i++) {
            System.out.print(arrs[i]);
        }
        
        for (int i = 2; i < len; i++) {
            System.out.print(arrt[i]);
        }
    }
}