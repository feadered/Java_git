import java.util.Scanner;

public class Main {
    //判断一个字符串是否是回文字符串
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        StringBuilder c = new StringBuilder();
        c.append(a);
        StringBuilder b = c.reverse();
        for (int i = 0; i < a.length(); i++) {
            char a1 = a.charAt(i);
            char b1 = b.charAt(i);
            if (a1!=b1){
                System.out.println("no");
            }
        }
        System.out.println("yes");
    }
}
