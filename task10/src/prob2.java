import java.util.HashMap;
import java.util.Scanner;

public class prob2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userInput = input.next();

        HashMap<Character, Integer> hash = new HashMap<>();

        for (int i = 0; i < userInput.length(); i++) {
            char c = userInput.charAt(i);
            hash.put(c, hash.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < userInput.length(); i++) {
            char c = userInput.charAt(i);
            if (hash.get(c) == 1) {
                System.out.println(c);
                break;
            }
        }
    }
}


