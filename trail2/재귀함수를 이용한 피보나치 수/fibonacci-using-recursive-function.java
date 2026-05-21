import java.util.Scanner;

public class Main {
    public static int f(int n) {
        if (n <= 2) {
            return 1;
        }
        if (n > 2) {
            return f(n-1) + f(n-2);
        }

        return f(n-1) + f(n-2);
    }
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(f(n));
    }
}