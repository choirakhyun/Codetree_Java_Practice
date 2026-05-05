import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] num = new int[100];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (m == a) {
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}