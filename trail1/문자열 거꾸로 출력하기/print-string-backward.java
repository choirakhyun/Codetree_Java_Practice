import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        while (true) {
            String s = sc.next();
            if (s.equals("END")) {
                break;
            }
            int len = s.length();
            for (int i = 0; i < len; i++) {
                System.out.print(s.charAt(len-i-1));
            }
            System.out.println();
        }
        sc.close();
    }
}