import java.util.Scanner;

public class Main {
    public static void Decimal(int a, int b) {
        int cnt = 0;
        int sum = 0;
        
        for (int i = a; i <= b; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    cnt++;
                }
            }
            if (cnt == 0) {
                sum += i;
            }
            cnt = 0;
        }
        System.out.print(sum);
    }

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Decimal(a, b);
    }
}