import java.util.Scanner;

public class Main {
    public static boolean main1(int c) {
        c = Math.abs(c); 
        while (c > 0) {
            int digit = c % 10;
            if (digit == 3 || digit == 6 || digit == 9) {
                return true;
            }
            c /= 10;
        }
        return false;
    }

    public static boolean main2(int d) {
        return d % 3 == 0 || main1(d);
    }
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;
        for (int i = a; i <= b; i++) {
            if (main2(i)) {
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}