import java.util.Scanner;

public class Main {
    public static void num(int a) {
        if (a >= 0) {
            System.out.print(a + " ");
        } else {
            a *= -1;
            System.out.print(a + " ");
        }
    }
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            num(a);
        }
    }
}