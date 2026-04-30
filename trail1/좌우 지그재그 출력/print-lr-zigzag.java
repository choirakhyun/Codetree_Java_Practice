import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                if (i == 1) {
                    for (int j = 1; j <= n; j++) {
                        System.out.print(cnt + " ");
                        cnt++;
                    }
                } else {
                    cnt += n;
                    for (int j = 1; j <= n; j++) {
                        System.out.print(cnt + " ");
                        cnt++;
                    }
                }
            } else {
                cnt += n;
                for (int j = 1; j <= n; j++) {
                    System.out.print(cnt - 1 + " ");
                    cnt--;
                }
            }
            System.out.println();
        }
    }
}