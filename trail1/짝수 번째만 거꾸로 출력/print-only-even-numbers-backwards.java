import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int len = s.length();
        char[] arr = new char[len];

        for (int i = 0; i < len; i++) {
            arr[i] = s.charAt(i);
        }
        for (int i = len-1; i >= 0; i--) {
            if (i % 2 == 1) {
                System.out.print(arr[i]);
            }
        }
    }
}