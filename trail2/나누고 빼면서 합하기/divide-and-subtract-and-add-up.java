import java.util.Scanner;
public class Main {
    public static void num(int m, int[] arr) {
        int sum = arr[m];
        while (true) {
            if (m == 1) {
                break;
            }
            if (m % 2 == 0) {
                m /= 2;
                sum += arr[m];
            } else if (m % 2 == 1) {
                m--;
                sum += arr[m];
            }
        } 
        System.out.print(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.
        num(m ,arr);
    }
}