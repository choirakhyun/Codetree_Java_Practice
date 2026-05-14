import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] arr = s.toCharArray();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            int a = (int)arr[i];
            if ((a >= 65 && a <= 90) || (a >= 97 && a <= 122)) {
                if (a >= 97 && a <= 122) {
                    System.out.print((char)(a-32));
                } else {
                    System.out.print((char)a);
                }
            }
        }
    }
}