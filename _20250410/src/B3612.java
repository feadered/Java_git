import java.util.Scanner;

public class B3612 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int[] dp = new int[n+1];
        for (int i = 1; i < dp.length; i++) {
            dp[i] = dp[i-1]+arr[i-1];
        }
        while (m!=0){
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            System.out.println(dp[r]-dp[l-1]);
        }
    }
}
