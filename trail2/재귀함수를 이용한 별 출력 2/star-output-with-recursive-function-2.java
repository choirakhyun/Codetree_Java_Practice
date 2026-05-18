import java.util.Scanner;

public class Main {
    public static void DecreNum(int s, int n) {
        if (n == -(s+1)) {
            return;
        }

        if (n < 0) {
            for (int i = 1; i <= n * -1; i++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        } else if (n > 0) {
            for (int i = 1; i <= n; i++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        DecreNum(s, n - 1);
    }
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = n;
        DecreNum(s, n);
    }
}