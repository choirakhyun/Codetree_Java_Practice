import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            String arr = sc.next();
            sum += arr.length();
            if (arr.charAt(0) == 'a') {
                    cnt++;
            }
        }
        System.out.printf("%d %d", sum, cnt);
    }
}