import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char b = sc.next().charAt(0);
        int len = a.length();
        int n = -1;

        for (int i = len-1; i >= 0; i--) {
            if (a.charAt(i) == b) {
                n = i;
            }
        }

        if (n == -1) {
            System.out.print("No");
        } else {
            System.out.print(n);
        }
    }
}