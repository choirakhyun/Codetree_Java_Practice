import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b;
        String str = Integer.toString(c);
        int len = str.length();
        int cnt = 0;
        char[] arr = str.toCharArray();

        for (int i = 0; i < len; i++) {
            if (arr[i] == '1') {
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}