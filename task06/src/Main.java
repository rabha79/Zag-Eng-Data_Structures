import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println(reverse("kjkjkjkj"));
        System.out.println(BalanceExpression.isValid("((<>)"));
    }

    public static String reverse(String s) {
        Stack<Character> Stack = new Stack<>();
        String reverse = "";

        for (int i = 0; i < s.length(); i++)
            Stack.push(s.charAt(i));

        while (!Stack.isEmpty()) {
            reverse += Stack.pop();

        }
        return reverse;

    }
}