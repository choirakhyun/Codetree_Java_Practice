import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        String r = sc.next();

        int lens = s.length();
        int lent = t.length();
        int lenr = r.length();

        int max = lens;
        int min = lens;

        if (lent > max) {
            max = lent;
        }
        if (lenr > max) {
            max = lenr;
        }
        if (lent < min) {
            min = lent;
        }
        if (lenr < min) {
            min = lenr;
        }
        System.out.print(max - min);
    }
}