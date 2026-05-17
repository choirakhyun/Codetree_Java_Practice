import java.util.Scanner;

public class Main {
    public static void num(int a, int b) {
        if (a > b) {
            a += 25;
            b *= 2;
        } else {
            a *= 2;
            b += 25;
        }
        System.out.printf("%d %d", a, b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        num(a, b);
    }
}