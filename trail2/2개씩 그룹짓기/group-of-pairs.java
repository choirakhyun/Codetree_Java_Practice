import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static int max = 0;

    public static int f(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            if (arr[i] + arr[2*n-1-i] >= max) {
                max = arr[i] + arr[2*n-1-i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[2 * n];

        for (int i = 0; i < 2 * n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.print(f(arr, n));
    }
}