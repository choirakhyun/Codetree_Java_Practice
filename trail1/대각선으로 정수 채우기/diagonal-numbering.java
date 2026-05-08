import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int cnt = 1;
        int[][] arr = new int[n][m];
        for (int i = 0; i < n+m-1; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = m-1; k >= 0; k--) {
                    if (j + k == i) {
                        arr[j][k] = cnt;
                        cnt++;
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}