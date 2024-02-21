import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userInput = input.next();

        int[] freq = new int[26];

        for (int i = 0; i < userInput.length(); i++)
            freq[hash(userInput.charAt(i))]++;


        for (int i = 0; i < userInput.length(); i++) {
            int index = hash(userInput.charAt(i));
            if (freq[index] == 1) {
                System.out.println(userInput.charAt(i));
                break;
            }

        }

    }

    public static int hash(int c) {
        return c - 'a';
    }
}