import java.util.Scanner;

public class Main {
    public static void Square(int a, int b) {
        int prd = 1;
        for (int i = 1; i <= b; i++) {
            prd *= a;
        }
        System.out.print(prd);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        Square(a, b);
    }
}