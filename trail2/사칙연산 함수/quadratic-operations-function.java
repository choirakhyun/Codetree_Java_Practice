import java.util.Scanner;
public class Main {
    public static void Calculation(int a, int b, char c) {
        if (c == '+') {
            System.out.printf("%d + %d = %d", a, b, a+b);
        } else if (c == '-') {
            System.out.printf("%d - %d = %d", a, b, a-b);
        } else if (c == '/') {
            System.out.printf("%d / %d = %d", a, b, a/b);
        } else if (c == '*') {
            System.out.printf("%d * %d = %d", a, b, a*b);
        } else {
            System.out.print("False");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char o = sc.next().charAt(0);
        int c = sc.nextInt();
        // Please write your code here.
        Calculation(a,c,o);
    }
}