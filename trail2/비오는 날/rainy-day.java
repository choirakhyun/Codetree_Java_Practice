import java.util.Scanner;

class Rainy {
    String date;
    String day;
    String weather;

    public Rainy (String date, String day, String weather) {
        this.date = date;
        this.day = day;
        this.weather = weather;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Rainy[] rainys = new Rainy[n];

        for (int i = 0; i < n; i++) {
            String date = sc.next();
            String day = sc.next();
            String weather = sc.next();
            // Please write your code here.
            rainys[i] = new Rainy(date, day, weather);
        }
        int cnt = 0;
        String min = "2101-01-01";
        for (int i = 0; i < n; i++) {
            Rainy rainyss = rainys[i];
            if (rainyss.weather.equals("Rain")) {
                if (rainyss.date.compareTo(min) < 0) {
                    min = rainyss.date;
                    cnt = i;
                }
            }
        }
        Rainy ans = rainys[cnt];
        System.out.printf("%s %s %s", ans.date, ans.day, ans.weather);
    }
}