import java.util.Scanner;

public class demo6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		int count = 0;
		for (int i = 0; i < string.length(); i++) {
			char a = string.charAt(i);
			if (Character.isDigit(a)) {
				count++;
			}
		}
		System.out.println(count);
	}

}
