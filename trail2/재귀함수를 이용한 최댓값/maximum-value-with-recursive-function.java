import java.util.Scanner;
public class Main {
    public static int num = 0;
    public static int f(int[] arr, int n) {
        if (n <= 0) {
            return num;
        }
        if (arr[n-1] >= num) {
            num = arr[n-1];
            return f(arr, n-1);
        } else {
            return f(arr, n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        System.out.print(f(arr, n));
    }
}