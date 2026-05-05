import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] cnt = new int[b];
        while (true) {
            if (a <= 1) {
                break;
            } else {
                int c = a % b;
                a = a / b;
                cnt[c]++;
            }
        }
        int sum = 0;
        for (int i = 0; i < b; i++) {
            sum += cnt[i] * cnt[i];
        }
        System.out.print(sum);
    }
}