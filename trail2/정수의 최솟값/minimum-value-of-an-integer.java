import java.util.Scanner;

public class Main {
    public static void MinValue(int a, int b, int c) {
        int min = 101;
        if (a < min) {
            min = a;
        }
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        System.out.print(min);
    }

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        MinValue(n1, n2, n3);
    }
}