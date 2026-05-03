import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int srt = sc.nextInt();
        int end = sc.nextInt();
        int sum = 0;
        int cnt = 0;
        for (int i = srt; i <= end; i++) {
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }   
            }
            if (sum == i) {
                cnt++;
            }
            sum = 0;
        }
        System.out.print(cnt);
    }
}