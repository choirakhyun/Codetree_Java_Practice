import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 1;
        for (int i = n; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                if (cnt == 10) {
                    cnt = 1;
                    System.out.print(cnt + " ");
                    cnt++;
                } else {
                    System.out.print(cnt + " ");
                    cnt++;
                }
            }
            System.out.println();
        }
    }
}