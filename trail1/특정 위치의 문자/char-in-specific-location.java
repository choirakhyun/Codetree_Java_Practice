import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        char[] word = new char[]{'L', 'E', 'B', 'R', 'O', 'S'};
        char w = sc.next().charAt(0);
        int n = -1;
        for (int i = 0; i <= 5; i++) {
            if (word[i] == w) {
                n = i;
            }
        }
        if (n == -1) {
            System.out.print("None");
        } else {
            System.out.print(n);
        }
    }
}