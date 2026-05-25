import java.util.Scanner;

class Codename {
    char name;
    int score;
    
    public Codename (char name, int score) {
        this.name = name;
        this.score = score;
    }
}

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        Codename[] arr = new Codename[5];
        for (int i = 0; i < 5; i++) {
            char name = sc.next().charAt(0);
            int score = sc.nextInt();
            arr[i] = new Codename(name, score);
        }
        int min = 100;
        int cnt = 0;
        for (int i = 0; i < 5; i++) {
            Codename a = arr[i];
            if (a.score <= min) {
                min = a.score;
            }
        }
        for (int i = 0; i < 5; i++) {
            Codename a = arr[i];
            if (a.score == min) {
                cnt = i;
            }
        }
        Codename b = arr[cnt];
        System.out.printf("%s %d", b.name, b.score);
    }
}