
import java.util.Scanner;

public class P8772 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            sum+=arr[i];
        }
        System.out.println(sum);
        long Sn = 0;
        long[] dp1 = new long[n+1];
        for (int i = 1; i < dp1.length; i++) {
            dp1[i] = dp1[i-1]+arr[i-1];
        }
        //System.out.println(Arrays.toString(dp1));
        long[] dp = new long[n];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = arr[i]*(sum-dp1[i+1]);
            Sn = Sn+dp[i];
        }
        System.out.println(Sn);
    }
}
