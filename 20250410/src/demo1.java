import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class demo1 {
	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<>();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int c = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
			System.out.println(map);
		}
		long res = 0;
		for (int i = 0; i < n; i++) {
			int b = arr[i]-c;
			res+=map.getOrDefault(b,0);
		}
		System.out.println(res);
	}

}
