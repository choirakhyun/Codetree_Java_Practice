import java.util.Scanner;

public class Main {
    public static boolean LeapYear1(int a) {
        return a % 100 != 0 || a % 400 == 0;
    }
    public static boolean LeapYear2(int a) {
        return a % 4 == 0 && LeapYear1(a);
    }

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        if (LeapYear2(y)) {
            System.out.print(true);
        } else {
            System.out.print(false);
        }
    }
}