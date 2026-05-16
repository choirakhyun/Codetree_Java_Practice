import java.util.Scanner;
public class Main {
    public static void ConArray(int a) {
        if (a > 0) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] a = new int[n1];
        int[] b = new int[n2];
        int n = 0;
        for (int i = 0; i < n1; i++)
            a[i] = sc.nextInt();
        for (int i = 0; i < n2; i++)
            b[i] = sc.nextInt();
        // Please write your code here.
        for (int i = 0; i <= n1 - n2; i++) {
            int cnt = 0;
            for (int j = 0; j < n2; j++) {
                if (a[i+j] == b[j]) {
                    cnt++;
                } else {
                    break;
                }
                if (cnt == n2) {
                    n++;
                }
            }
            cnt = 0;
        }
        ConArray(n);
    }
}