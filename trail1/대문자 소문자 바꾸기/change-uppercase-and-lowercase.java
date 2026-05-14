import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] arr = s.toCharArray();
        int len = s.length();

        for (int i = 0; i < len; i++) {

            int n = (int)arr[i];
            if (n >= (int)'a' && n <= (int)'z') {
                System.out.print((char)(n-32));
            } else if (n >= (int)'A' && n <= (int)'Z') {
                System.out.print((char)(n+32));
            }
        }
    }
}