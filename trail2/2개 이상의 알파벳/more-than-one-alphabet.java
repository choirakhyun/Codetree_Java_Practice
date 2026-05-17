import java.util.Scanner;
public class Main {
    public static void num(String s) {
        int len = s.length();
        int cnt = 0;
        for (int i = 1; i < len; i++) {
            if (s.charAt(i-1) != s.charAt(i)) {
                cnt++;
            }
        }
        if (cnt > 0) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        // Please write your code here.
        num(A);
    }
}