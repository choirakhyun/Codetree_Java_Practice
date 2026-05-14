import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] arr = new String[300];
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        while (true) {
            String s = sc.next();
            if (s.equals("0")) {
                break;
            }
            cnt++;
            if (cnt % 2 == 1) {
                arr[cnt] = s;
            }
        }

        System.out.println(cnt);
        for (int i = 1; i <= cnt; i+=2) {
            System.out.println(arr[i]);
        }
    }
}