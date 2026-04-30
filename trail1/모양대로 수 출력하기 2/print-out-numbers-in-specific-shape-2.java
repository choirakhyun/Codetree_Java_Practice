import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (cnt % 10 == 0) {
                    System.out.print(cnt % 10 + 2 + " ");
                    cnt+= 4;
                } else {
                    System.out.print(cnt % 10 + " ");
                    cnt+= 2;
                }
            }
            System.out.println("");
        }
    }
}