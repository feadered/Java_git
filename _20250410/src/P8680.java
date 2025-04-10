import java.util.Scanner;

public class P8680 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long count = 0;
        for (int i = 1; i <= n; i++) {
            if(suit(i)){
                //System.out.println(i);
                count = count+i;
            }
        }
        System.out.println(count);
    }
    private static boolean suit(int a){
        while (a!=0){
            int b = a%10;
            if (b==2||b==0||b==1||b==9){
                return true;
            }
            a = a/10;
        }
        return false;
    }
}
