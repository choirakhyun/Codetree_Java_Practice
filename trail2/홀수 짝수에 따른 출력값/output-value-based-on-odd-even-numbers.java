import java.util.Scanner;

public class Main {
    public static int f(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n % 2 == 0) {
            return f(n - 2) + n;
        } else {
            return f(n - 2) + n;
        }
    }
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(f(n));
    }
}