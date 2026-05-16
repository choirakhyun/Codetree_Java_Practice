import java.util.Scanner;

public class Main {
    public static boolean PfNum1(int a) {
        return a % 2 != 0 && a % 10 != 5;
    }
    public static boolean PfNum2(int a) {
        return PfNum1(a) && (a % 3 != 0 || a % 9 == 0);
    }

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;

        for (int i = a; i <= b; i++) {
            if (PfNum2(i)) {
                cnt++;
            }
        }

        System.out.print(cnt);
    }
}