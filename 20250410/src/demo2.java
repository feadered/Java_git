import java.util.Scanner;
import java.util.Stack;

public class demo2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		Stack<Integer> stack = new Stack<>();
		while (in.hasNextInt()) {
			int a = in.nextInt();
			if(a!=0) {
				stack.push(a);
			}
		}
		while (!stack.isEmpty()) {
			System.out.print(stack.pop()+" ");;
		}
	}
}
