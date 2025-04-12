import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class demo5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		Queue<Integer> queue = new LinkedList<>();
		for (int i = 1; i <= n; i++) {
			queue.add(i);
		}
		int res = 0;
		while (!queue.isEmpty()) {
			int x = queue.poll();
			res++;
			if (res==m) {
				System.out.print(x+" ");
				res = 0;
			}else {
				queue.add(x);
			}
			
		}
	}

}
