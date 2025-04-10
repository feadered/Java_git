import java.util.Scanner;

public class AB2021 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        for (int i = 1; i < n; i++) {
            if ((i*i)%n<n/2){
                count++;
            }
        }
        System.out.println(count);
    }
}
