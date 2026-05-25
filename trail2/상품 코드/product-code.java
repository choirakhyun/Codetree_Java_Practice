import java.util.Scanner;

class Prod {
    String name;
    int code;
    
    public Prod () {
        this.name = "codetree";
        this.code = 50;
    }

    public Prod (String name, int code) {
        this.name = name;
        this.code = code;
    }
}

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        Prod a = new Prod();
        System.out.printf("product %d is %s\n", a.code, a.name);

        a.name = sc.next();
        a.code = sc.nextInt();

        System.out.printf("product %d is %s", a.code, a.name);
    }
}