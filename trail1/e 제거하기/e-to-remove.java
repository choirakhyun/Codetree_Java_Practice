import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] arr = s.toCharArray();
        int len = s.length();
        int idx = -1;

        for (int i = 0; i < len; i++) {
            if (arr[i] == 'e') {
                idx = i;
                break;
            }
        }
        s = s.substring(0, idx) + s.substring(idx+1);
        System.out.print(s);
    }
}