import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        for (int i = 1; i <= q; i++) {
            int m = sc.nextInt();
            if (m == 1) {
                int a = sc.nextInt();
                System.out.println(num[a-1]);
            } else if (m == 2) {
                int b = sc.nextInt();
                int cnt = 0;
                for (int j = n - 1; j >= 0; j--) {
                    if (num[j] == b) {
                        cnt = j+1;
                    }
                }
                System.out.println(cnt);
            } else if (m == 3) {
                int s = sc.nextInt();
                int e = sc.nextInt();
                for (int j = s - 1; j < e; j++) {
                    if (j == e-1) {
                        System.out.println(num[j]);
                    } else {
                        System.out.print(num[j] + " ");
                    }
                }
            }
        }
    }
}