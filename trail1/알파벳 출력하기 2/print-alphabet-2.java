import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 65;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = n; j >= i; j--) {
                if (cnt == 90) {
                    System.out.print((char)cnt + " ");
                    cnt = 65;
                } else {
                    System.out.print((char)cnt + " ");
                    cnt++;
                }
            }
            System.out.println();
        }
    }
}