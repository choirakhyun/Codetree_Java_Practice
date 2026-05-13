import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        while (true) {
            int len = s.length();
            if (len == 1) {
                break;
            }
            int n = sc.nextInt();
            if (n == 0) {
                s = s.substring(1);
            } else if (n >= len) {
                s = s.substring(0, len-1);
            } else {
                s = s.substring(0, n) + s.substring(n+1);
            }
            System.out.println(s);
        }
    }
}