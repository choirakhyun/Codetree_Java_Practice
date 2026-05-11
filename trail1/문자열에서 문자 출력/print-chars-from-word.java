import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int len = s.length();

        for (int i = 0; i < len; i++) {
            System.out.println(s.charAt(i));
        }
    }
}