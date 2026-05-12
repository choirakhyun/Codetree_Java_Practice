import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        char[] arr = s.toCharArray();
        arr[1] = 'a';
        arr[n-2] = 'a';
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }
        
    }
}