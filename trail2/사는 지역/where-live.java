import java.util.Scanner;
import java.util.Arrays;

class Addr {
    String name;
    String addr;
    String city;

    public Addr (String name, String addr, String city) {
        this.name = name;
        this.addr = addr;
        this.city = city;
    }
}

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str1 = new String[n];
        String[] str2 = new String[n];
        Addr[] arr = new Addr[n];
        for (int i = 0; i < n; i++) {
            String a = sc.next();
            String b = sc.next();
            String c = sc.next();
            str1[i] = a;
            str2[i] = a;
            arr[i] = new Addr(a, b, c);
        }
        Arrays.sort(str1);
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (str1[n-1] == str2[i]) {
                cnt = i;
            }
        }

        System.out.printf("name %s\n", arr[cnt].name);
        System.out.printf("addr %s\n", arr[cnt].addr);
        System.out.printf("city %s\n", arr[cnt].city);
    }
}