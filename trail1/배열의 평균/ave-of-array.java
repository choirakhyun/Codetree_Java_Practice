import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2][4];
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 4; i++) {
            a += arr[0][i];
            b += arr[1][i];
        }
        System.out.println((float)a / 4 + " " + (float)b / 4);
        a = 0;
        b = 0;
        for (int i = 0; i < 2; i++) {
            a += arr[i][0];
            b += arr[i][1];
            c += arr[i][2];
            d += arr[i][3];
        }
        System.out.println((float)a / 2 + " " + (float)b / 2 + " " + (float)c / 2 + " " + (float)d / 2);
        a = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                a += arr[i][j];
            }
        }
        System.out.printf("%.1f",(float)a / 8);
    }
}