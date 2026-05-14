import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String b = sc.next();
        int len = s.length();
        int n = b.length();
        char[] arr = b.toCharArray();

        for (int i = 0; i < n; i++) {
            if (arr[i] == 'L') {
                s = s.substring(1) + s.substring(0, 1);
            } else if (arr[i] == 'R') {
                s = s.substring(len-1) + s.substring(0, len-1);
            }
        }

        System.out.print(s);
    }
}