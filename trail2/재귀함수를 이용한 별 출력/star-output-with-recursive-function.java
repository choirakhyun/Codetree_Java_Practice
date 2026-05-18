import java.util.Scanner;

public class Main {
    public static void RefuNum(int s, int n) {
        if (n == 0) {
            return;
        }
        for (int i = s; i >= n; i--) {
            System.out.print("*");
        }
        System.out.println();
        RefuNum(s, n - 1);
    }
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = n;
        RefuNum(s, n);
    }
}