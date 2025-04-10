import java.util.HashMap;
import java.util.Scanner;

public class P8649 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        scanner.close();
        // 计算前缀和
        long[] prefixSum = new long[N + 1];
        for (int i = 1; i <= N; i++) {
            prefixSum[i] = prefixSum[i - 1] + A[i - 1];
        }
        // 使用哈希表存储每个取模结果出现的次数
        HashMap<Long, Integer> modCount = new HashMap<>();
        modCount.put(0L, 1); // 初始化，因为前缀和为0时，区间数量为1
        long result = 0;
        // 遍历前缀和，计算区间数量
        for (int i = 1; i <= N; i++) {
            long mod = prefixSum[i] % K;
            if (modCount.containsKey(mod)) {
                result += modCount.get(mod);
            }
            modCount.put(mod, modCount.getOrDefault(mod, 0) + 1);
        }
        System.out.println(result);
    }
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        long[] dp = new long[N+1];
        for (int i = 1; i < dp.length; i++) {
            dp[i] = dp[i-1]+arr[i-1];
        }
        long count = 0;
        for (int i = 0; i < dp.length; i++) {
            for (int j = i+1; j < dp.length; j++) {
                if((dp[j]-dp[i])%K==0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
