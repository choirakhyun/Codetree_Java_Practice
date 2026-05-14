import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        int lena = a.length();
        int lenb = b.length();

        char[] arra = a.toCharArray();
        char[] arrb = b.toCharArray();

        String c = "";
        String d = "";
        
        for (int i = 0; i < lena; i++) {
            int n = (int)arra[i];
            if (n >= '0' && n <= '9') {
                c += arra[i];
            }
        }
        
        for (int i = 0; i < lenb; i++) {
            int n = (int)arrb[i];
            if (n >= '0' && n <= '9') {
                d += arrb[i];
            }
        }
        System.out.print(Integer.parseInt(c) + Integer.parseInt(d));
    }
}