import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[11];
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            } else {
                int a = n / 10;
                arr[a]++;
            }
        }

        for (int i = 10; i >= 1; i--) {
            System.out.printf("%d - %d\n", i * 10, arr[i]);
        }
    }
}