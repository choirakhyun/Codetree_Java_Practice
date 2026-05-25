import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String t = sc.next();
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }
        // Please write your code here.
        Arrays.sort(words);
        int len = t.length();
        int fina = 0;
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < len; j++) {
                if (words[i].charAt(j) == t.charAt(j)) {
                    cnt++;
                } else {
                    break;
                }
            }
            if (cnt == len) {
                fina++;
            }
            if (fina == k) {
                System.out.print(words[i]);
                break;
            }
        }
    }
}