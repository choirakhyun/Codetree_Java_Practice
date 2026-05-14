import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int cnt = 0;
        
        for (int i = 1; i <= n; i++) {
            String a = sc.next();
            if (s.equals(a)) {
                cnt++;
            }
        }
        System.out.print(cnt);
        sc.close();
    }
}