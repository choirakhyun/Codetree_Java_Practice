import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n ; i++) {
            int a = sc.nextInt();
            sum += a;
        }

        String s = Integer.toString(sum);
        int len = s.length();
        s = s.substring(1) + s.substring(0, 1);
        System.out.print(s);
    } 
}