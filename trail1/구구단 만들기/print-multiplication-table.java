import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = 1; i <= 9; i++) {
            for (int j = b; j >= a; j-=2) {
                if (j == a) {
                    System.out.print(j + " * " + i + " = " + i*j);
                } else {
                    System.out.print(j + " * " + i + " = " + i*j + " / ");
                }
            }
            System.out.println();
        }
    }
}