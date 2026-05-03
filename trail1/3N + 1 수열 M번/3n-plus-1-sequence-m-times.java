import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int a = sc.nextInt();
            int sum = a;
            int cnt = 0;
            for (int j = 1; true; j++) {
                if (sum == 1) {
                    System.out.println(cnt);
                    break;
                } else {
                    if (sum % 2 == 0) {
                        sum /= 2;
                        cnt++;
                    } else {
                        sum *= 3;
                        sum++;
                        cnt++;
                    }
                }
            }
            cnt = 0;
        }
    }
}