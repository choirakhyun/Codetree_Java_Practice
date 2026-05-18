import java.util.Scanner;
public class Main {
    public static final int MAX_N = 100;

    public static void intSum(int a1, int a2, int[] arr) {
        int sum = 0;
        for (int i = a1-1; i < a2; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            // Please write your code here.
            intSum(a1, a2, arr);
        }
    }
}