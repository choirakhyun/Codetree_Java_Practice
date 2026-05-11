import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[]{"apple", "banana", "grape", "blueberry", "orange"};
        int cnt = 0;
        char s = sc.next().charAt(0);
        for (int i = 0; i < 5; i++) {
            if (arr[i].charAt(2) == s || arr[i].charAt(3) == s) {
                System.out.println(arr[i]);
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}