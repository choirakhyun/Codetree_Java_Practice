import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int len = s.length();
        int cnt = 0;
        String a = sc.next();

        while (true) {
            if (s.equals(a)) {
                break;
            } else if (cnt > len) {
                cnt = -1;
                break;
            }
            s = s.substring(len-1) + s.substring(0, len-1);
            cnt++;
        }
        System.out.print(cnt);
    }
}