import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] cnt = new int[5];
        for (int i = 1; i <= 3; i++) {
            char w = sc.next().charAt(0);
            int n = sc.nextInt();
            if (w == 'Y' && n >= 37) {
                cnt[0]++;
            } else if (w == 'N' && n >= 37) {
                cnt[1]++;
            } else if (w == 'Y' && n < 37) {
                cnt[2]++;
            } else if (w == 'N' && n < 37){
                cnt[3]++;
            }
        }
        System.out.print(cnt[0] + " " + cnt[1] + " " + cnt[2] + " " + cnt[3]);
        if (cnt[0] >= 2) {
            System.out.print(" E");
        }
    }
}