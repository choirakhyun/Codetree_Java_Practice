import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int max = -998;
        int min = 998;
        for (int i = 0; i < 100; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == -999 || arr[i] == 999) {
                break;
            }
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.printf("%d %d",max,min);
    }
}