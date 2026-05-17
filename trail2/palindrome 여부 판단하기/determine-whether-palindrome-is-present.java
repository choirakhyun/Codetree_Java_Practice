import java.util.Scanner;

public class Main {
    public static void reverse(char[] arr, String str) {
        int n = str.length();
        String s = "";
        for (int i = n-1; i >= 0; i--) {
            s += arr[i];
        }
        if (str.equals(s)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] arr = s.toCharArray();
        reverse(arr, s);
    }
}