import java.util.Scanner;
public class Main {
    public static int f(int n) {
        if (n < 10) {
            return n;
        } else {
            return f(n / 10) + (n % 10);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // Please write your code here.
        int d = a * b * c;
        System.out.print(f(d));
        sc.close();
    }
}