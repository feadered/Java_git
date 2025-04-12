import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int T = in.nextInt();
		while (T!=0) {
			int n = in.nextInt();
			int[] arr = new int[n];
			Set<Integer> set = new HashSet<>();
			for (int i = 0; i < arr.length; i++) {
				arr[i] = in.nextInt();
				if(!set.contains(arr[i])) {
					set.add(arr[i]);
					System.out.print(arr[i]+" ");
				}
			}
			System.out.println();
			T--;
		}
	}

}
