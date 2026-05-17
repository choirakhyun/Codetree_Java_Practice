import java.util.Scanner;

public class Main {
    public static void num(int a, int b) {
        if (a > b) {
            System.out.printf("%d %d", a*2, b+10);
        } else {
            System.out.printf("%d %d", a+10, b*2);
        }
    }
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        num(a, b);
    }
}