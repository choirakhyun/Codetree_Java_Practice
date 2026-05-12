import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] arr = s.toCharArray();
        int len = s.length();
        char a = arr[1];

        for (int i = 0; i < len; i++) {
            if (arr[i] == a) {
                arr[i] = arr[0];
            }
        }

        for (int i = 0; i < len; i++) {
            System.out.print(arr[i]);
        }
    }
}