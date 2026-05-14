import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        int num1 = extractInteger(str1);
        int num2 = extractInteger(str2);

        System.out.println(num1 + num2);
        
        sc.close();
    }

    private static int extractInteger(String s) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                sb.append(c);
            } else {
                break;
            }
        }

        return Integer.parseInt(sb.toString());
    }
}