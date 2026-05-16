import java.util.Scanner;
public class Main {
    public static boolean LeapYear(int y) {
        if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean DateCode(int y, int m, int d) {
        if (m < 1 || m > 12 || d < 1) {
            return false;
        }

        if (m == 2) {
            if (LeapYear(y)) {
                return d <= 29;
            } else {
                return d <= 28;
            }
        } 
        else if (m <= 7) {
            if (m % 2 == 0) { 
                return d <= 30;
            } else {     
                return d <= 31;
            }
        } 
        else { 
            if (m % 2 == 0) {
                return d <= 31;
            } else { 
                return d <= 30;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        // Please write your code here.
        if (DateCode(y, m, d)) {
            if (m <= 5 && m >= 3) {
                System.out.print("Spring");
            } else if (m <= 8 && m >= 6) {
                System.out.print("Summer");
            } else if (m <= 11 && m >= 9) {
                System.out.print("Fall");
            } else if (m <= 2 || m >= 12) {
                System.out.print("Winter");
            }
        } else {
            System.out.print("-1");
        }
    }
}