import java.util.Scanner;

public class Main {
    public static void PrmNum(int a, int b) {
        int cnt2 = 0;
        for (int i = a; i <= b; i++) {
            int cnt = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    cnt++;
                }
            }
            if (cnt == 0) {
                if ((i / 10 + i % 10) % 2 == 0) {
                    cnt2++;
                }
            }
        }
        System.out.print(cnt2);
    }

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        PrmNum(a, b);
    }
}