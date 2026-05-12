import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String str = "";
        int cnt = 1;
        int len = s.length();
        char[] arr = new char[len+1];
        
        for (int i = 0; i < len; i++) {
            arr[i] = s.charAt(i);
        }
        
        for (int i = 1; i <= len; i++) {
            if (arr[i] != arr[i-1]) {
                str += arr[i-1];
                str += cnt;
                cnt = 1;
            } else {
                cnt++;
            }
        }
        System.out.println(str.length());
        System.out.print(str);
    }
}