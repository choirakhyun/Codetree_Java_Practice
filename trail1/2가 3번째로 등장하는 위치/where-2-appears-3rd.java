import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] str = new int[n];
        for (int i = 0; i < n; i++) {
            str[i] = sc.nextInt();
        }
        int cnt = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (str[i] == 2) {
                cnt = i+1;
                sum++;
                if (sum == 3) {
                    System.out.print(cnt);
                    break;
                }
            }
        }
    }
}