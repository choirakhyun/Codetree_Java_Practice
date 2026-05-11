import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[10];
        int[] len = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.next();
            len[i] = arr[i].length();
        }
        char s = sc.next().charAt(0);
        int cnt = 0;
        for (int i = 0; i < 10; i++) {
            if (arr[i].charAt(len[i]-1) == s) {
                System.out.println(arr[i]);
                cnt++;
            }
        }
        if (cnt == 0) {
            System.out.print("None");
        }
    }
}