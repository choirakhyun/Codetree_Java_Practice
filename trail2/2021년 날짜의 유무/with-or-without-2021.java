import java.util.Scanner;

public class Main {
    public static boolean DateCode(int m, int d) {
        if (m < 1 || m > 12 || d < 1) {
            return false;
        }

        if (m == 2) {
            return d <= 28; 
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
        int m = sc.nextInt();
        int d = sc.nextInt();
        
        if (DateCode(m, d)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
        
        sc.close();
    }
}