import java.util.Scanner;

public class Main {
    public static void Return(int n) {
        if (n == 0) {
            return;
        }
        Return(n-1);
        System.out.println("HelloWorld");
    }
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Return(n);
    }
}