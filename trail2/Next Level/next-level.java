import java.util.Scanner;

class Level {
    String id;
    int lv;
    public Level () {
        this.id = "codetree";
        this.lv = 10;
    }

    public Level (String id, int lv) {
        this.id = id;
        this.lv = lv;
    }
}
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        Level Level1 = new Level();

        System.out.printf("user %s lv %d\n", Level1.id, Level1.lv);

        Level1.id = sc.next();
        Level1.lv = sc.nextInt();

        System.out.printf("user %s lv %d", Level1.id, Level1.lv);
    }
}