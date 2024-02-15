import java.util.Scanner;

public class prob2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userInput = input.next();

        int[] freq = new int[26];

        for (int i = 0; i < userInput.length(); i++)
            freq[userInput.charAt(i) - 'a']++;
        for (int i = 0; i < freq.length; i++)
            if (freq[i] != 0)
                System.out.println((char) (i + 'a') + " : " + freq[i]);
    }
}