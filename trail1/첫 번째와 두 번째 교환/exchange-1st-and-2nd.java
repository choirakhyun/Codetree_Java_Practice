import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] arr = s.toCharArray();
        int len = s.length();
        char a = arr[0];
        char b = arr[1];

        for (int i = 0; i < len; i++) {
            if (arr[i] == a) {
                System.out.print(b);
            } else if (arr[i] == b) {
                System.out.print(a);
            } else {
                System.out.print(arr[i]);
            }
        }
        
    }
}