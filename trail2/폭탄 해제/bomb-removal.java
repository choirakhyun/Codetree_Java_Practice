import java.util.Scanner;

class Boom {
    String code;
    char color;
    int time;

    public Boom (String code, char color, int time) {
        this.code = code;
        this.color = color;
        this.time = time;
    }
}

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String code = sc.next();
        char color = sc.next().charAt(0);
        int time = sc.nextInt();
        Boom a = new Boom(code, color, time);

        System.out.printf("code : %s\n", a.code);
        System.out.printf("color : %s\n", a.color);
        System.out.printf("second : %d", a.time);
    }
}