import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();
        int len = s.length();
        for (int i = len-1; i > len-n-1 && i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
    }
}