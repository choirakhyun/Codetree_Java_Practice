import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int m = n;

        while (m > 0) {
            int max = arr[0];
            int cnt = 0;

            for (int j = 1; j < m; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    cnt = j;
                }
            }

            System.out.print((cnt + 1) + " ");
            m = cnt; 
        }
        sc.close();
    }
}