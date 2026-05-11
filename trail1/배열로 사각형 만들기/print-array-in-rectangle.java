public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        int[][] arr = new int[5][5];
        int cnt = 1;
        for (int i = 0; i < 5; i++) {
            arr[0][i] = 1;
        }
        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 0) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i-1][j] + arr[i][j-1];
                }
                
            }
            cnt = 1;
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}