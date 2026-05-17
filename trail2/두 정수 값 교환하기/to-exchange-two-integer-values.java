import java.util.Scanner;

public class Main {
    public static void Swap(int n, int m) {
        int tem = n;
        n = m;
        m = tem;
        System.out.printf("%d %d", n, m);
    }
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Swap(n, m);
    }
}