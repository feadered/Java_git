package LAOQIAO;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double in = scanner.nextDouble();
        double out = 5*(in-32)/9;
        System.out.printf("c=%.2f",out);
    }
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
			int a = scanner.nextInt();
			int[] arr = new int[55];
			if(a==0) {
				return;
			}
			if (a>=55) {
				continue;
			}
			if (a==1||a==2||a==3||a==4) {
				arr[a] = a;
				System.out.println(arr[a]);
			}else {
				arr[1] = 1;
				arr[2] = 2;
				arr[3] = 3;
				arr[4] = 4;
				for (int i = 5; i < 55; i++) {
					arr[i] = arr[i-1]+arr[i-3];
				}
				System.out.println(arr[a]);
			}
		}
    }
}
