import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int num = -1;
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = n-1; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                if (arr[i] != arr[j]) {
                    cnt++;
                }
                if (cnt == n-1) {
                    if (arr[i] > num) {
                        num = arr[i];
                    }
                }
            }
            cnt = 0;
        }
        System.out.print(num);
    }
}