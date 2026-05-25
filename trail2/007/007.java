import java.util.Scanner;

class Secret {
    String code;
    char loca; 
    int time;
    public Secret (String code, char loca, int time) {
        this.code = code;
        this.loca = loca;
        this.time = time;
    }
}

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        char b = sc.next().charAt(0);
        int c = sc.nextInt();

        Secret arr = new Secret(a, b, c); 
        System.out.printf("secret code : %s\n", arr.code);
        System.out.printf("meeting point : %s\n", arr.loca);
        System.out.printf("time : %d\n", arr.time);
    }
}