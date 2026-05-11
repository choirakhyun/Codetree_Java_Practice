import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        char t = sc.next().charAt(0);
        int lens = s.length();
        int cnt = 0;

        for (int i = 0; i < lens; i++) {
            if (s.charAt(i) == t) {
                cnt++;
            }
        }

        System.out.print(cnt);
    }
}