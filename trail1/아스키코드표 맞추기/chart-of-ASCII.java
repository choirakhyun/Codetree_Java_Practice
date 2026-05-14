import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            int n = sc.nextInt();
            char a = (char) n;
            System.out.print(a + " ");
        }
    }
}