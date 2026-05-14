import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] arr = s.toCharArray();
        int len = s.length();
        int sum = 0;

        for (int i = 0; i < len; i++) {

            int n = (int)arr[i];

            if (n >= (int)'0' && n <= (int)'9') {
                sum += arr[i] - 48;
            }
        }
        System.out.print(sum);
    }
}