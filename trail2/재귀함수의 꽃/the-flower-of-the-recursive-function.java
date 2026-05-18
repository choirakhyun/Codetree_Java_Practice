import java.util.Scanner;
public class Main {
    public static void DecreNum(int s, int n) {
        if (n == -(s+1)) {
            return;
        }

        if (n < 0) {
            System.out.print(n * -1 + " ");
        } else if (n > 0) {
            System.out.print(n + " ");
        }

        DecreNum(s, n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = n;
        // Please write your code here.
        DecreNum(s, n);
    }
}