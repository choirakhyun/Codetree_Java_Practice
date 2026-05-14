import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = Integer.toString(n);
        int len = str.length();
        char[] arr = str.toCharArray();
        int sum = 0;

        for (int i = 0; i < len; i++) {
            int a = (int)arr[i];
            sum += a - 48;
        }

        System.out.print(sum);
    }
}