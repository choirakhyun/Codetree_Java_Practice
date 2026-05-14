import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        int n = (int)a;
        if (n == 97) {
            n = 122;
            System.out.print((char)n);
        } else {
            System.out.print((char)(n-1));
        }
    }
}