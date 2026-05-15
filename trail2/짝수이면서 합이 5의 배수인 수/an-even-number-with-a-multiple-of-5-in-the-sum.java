import java.util.Scanner;

public class Main {
    public static boolean MagicNum(int a) {
        return a % 2 == 0 && (a % 10 + a / 10) % 5 == 0;
    }

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (MagicNum(n)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}