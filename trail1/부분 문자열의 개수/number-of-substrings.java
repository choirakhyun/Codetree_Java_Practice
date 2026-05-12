import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int cnt = 0;
        int len = s.length();
        for (int i = 0; i < len-1; i++) {
            if (s.charAt(i) == t.charAt(0) && s.charAt(i+1) == t.charAt(1)) {
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}