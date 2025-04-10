
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = words.length-1; i >=0 ; i--) {
            String word = words[i];
            if (word.matches("\\d+")){
                result.append(new StringBuffer(word).reverse());
            } else if (word.equals(word.toLowerCase())) {
                result.append(word.toUpperCase());
            }else if (word.equals(word.toUpperCase())){
                result.append(word.toLowerCase());
            }
            if (i>0){
                result.append(" ");
            }
        }
        System.out.println(result.toString());
    }
}
