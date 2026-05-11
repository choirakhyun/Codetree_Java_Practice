import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();

        int lens = s.length();
        int lent = t.length();

        for (int i = 0; i < lens; i++) {
            if (s.charAt(i) == ' ') {

            } else {
                System.out.print(s.charAt(i));
            }
        }
        for (int i = 0; i < lent; i++) {
            if (t.charAt(i) ==' ') {

            } else {
                System.out.print(t.charAt(i));
            }
        }
    }
}