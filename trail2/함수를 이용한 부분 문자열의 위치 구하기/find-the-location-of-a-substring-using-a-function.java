import java.util.Scanner;

public class Main {
    public static void strlogic(String s, String t) {
        int n = s.length();
        int d = t.length();
        int idx = -1;
        for (int i = 0; i <= n - d; i++) {
            int cnt = 0;
            for (int j = 0; j < d; j++) {
                if (s.charAt(i+j) == t.charAt(j)) {
                    cnt++;
                }
                if (cnt == d) {
                    idx = i;
                }
            }
            if (idx != -1) {
                break;
            }
        }
        System.out.print(idx);
    }
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        strlogic(s, t);
    }
}