import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean a = false;
        boolean b = false;
        int len = s.length();

        for (int i = 0; i < len-1; i++) {
            if (s.charAt(i) == 'e' && s.charAt(i+1) == 'e') {
                a = true;
            }
            if (s.charAt(i) == 'a' && s.charAt(i+1) == 'b') {
                b = true;
            }
        }
        if (a == true) {
            System.out.print("Yes ");
        } else {
            System.out.print("No ");
        }
        if (b == true) {
            System.out.print("Yes ");
        } else {
            System.out.print("No ");
        }
    }
}