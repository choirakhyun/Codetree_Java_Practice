import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String d = sc.next();
        
        int lens = s.length();
        int lend = d.length();

        if (lens == lend) {
            System.out.print("same");
        } else if (lens > lend) {
            System.out.printf("%s %d", s, lens);
        } else if (lens < lend) {
            System.out.printf("%s %d", d, lend);
        }
    }
}