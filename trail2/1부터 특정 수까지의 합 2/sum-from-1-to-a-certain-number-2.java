import java.util.Scanner;

public class Main {
    public static int sum = 0;
    public static void fact(int n) {
        sum += n;
        if (n == 1) {
            System.out.print(sum);
            return;
        }
        fact(n-1);
    }
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fact(n);
    }
}