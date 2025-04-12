import java.util.Scanner;

public class demo4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] arr = in.nextLine().toCharArray();
		int countLeft = 0,countRight = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]=='@') {
				break;
			}
			if (arr[i]=='(') {
				countLeft++;
			}
			if(arr[i]==')') {
				countRight++;
			}
		}
		if(countLeft==countRight) {
			System.out.println("YES");
			return;
		}
		System.out.println("NO");
	}

}
