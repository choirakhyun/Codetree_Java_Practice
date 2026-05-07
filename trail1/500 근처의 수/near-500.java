import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int ovr = 1000;
        int und = 0;
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (arr[i] > 500) {
                if (arr[i] < ovr) {
                    ovr = arr[i];
                }
            } else {
                if (arr[i] > und) {
                    und = arr[i];
                }
            }
        }
        System.out.printf("%d %d", und, ovr);
    }
}