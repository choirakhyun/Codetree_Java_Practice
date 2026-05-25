import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int[] num = new int[i+1];
            if (i % 2 == 1) {
                continue;
            }
            for (int j = 0; j <= i; j++) {
                num[j] = arr[j];
            }
            Arrays.sort(num);
            int a = (i) / 2;
            System.out.print(num[a] + " ");
        }
    }
}