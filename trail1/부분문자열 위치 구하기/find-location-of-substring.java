import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int idx = s.indexOf(t);

        if (idx >= 0) {
            System.out.print(idx);
        } else {
            System.out.print("-1");
        }
    }
}