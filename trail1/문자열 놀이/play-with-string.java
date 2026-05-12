import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int q = sc.nextInt();
        char[] arr = s.toCharArray();
        int len = s.length();

        for (int i = 1; i <= q; i++) {
            int n = sc.nextInt();
            if (n == 1) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                char c = arr[a-1];
                arr[a-1] = arr[b-1];
                arr[b-1] = c;
                for (int j = 0; j < len; j++) {
                    System.out.print(arr[j]);
                }
            } else if (n == 2) {
                char a = sc.next().charAt(0);
                char b = sc.next().charAt(0);
                for (int j = 0; j < len; j++) {
                    if (arr[j] == a) {
                        arr[j] = b;
                    }
                }
                for (int j = 0; j < len; j++) {
                    System.out.print(arr[j]);
                }
            }
            System.out.println();
        }
    }
}