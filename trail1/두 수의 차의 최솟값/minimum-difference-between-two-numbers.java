import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        int min = 100;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = n-1; i >= 0; i--) {
            for (int j = i; j > 0; j--) {
                if (arr[i] - arr[j-1] < min) {
                    min = arr[i] - arr[j-1];
                }
            }
        }
        System.out.print(min);
    }
}