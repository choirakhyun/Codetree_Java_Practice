import java.util.Scanner;

public class Main {
    public static int f(int[] arr, int a, int n) {
        if (n == 1) {
            return a;
        }
        int gcd = 0;
        for(int i = 1; i <= Math.min(arr[n-1], a); i++) {
            if(arr[n-1] % i == 0 && a % i == 0)
                gcd = i;
        }    
        a = arr[n-1] * a / gcd;
        return f(arr, a, n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.
        int a = arr[0];
        System.out.print(f(arr, a, n));
        sc.close();
    }
}