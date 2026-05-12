import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        String m = "";
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }    
        for (int i = 0; i < n; i++) {
            m += arr[i];
        }    
        int len = m.length();
        for (int i = 0; i < len; i++) {
            if (i % 5 == 4) {
                System.out.print(m.charAt(i) + "\n");
            } else {
                System.out.print(m.charAt(i));
            }
        }
   }
}