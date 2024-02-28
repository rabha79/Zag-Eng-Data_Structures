import java.util.HashMap;


public class prob1 {
    public static void main(String[] args) {
        String s = "an green apple";

        HashMap<Character, Integer> hashtable = new HashMap<>();


        for (int i = 0; i < s.length(); i++) {

            int value = hashtable.containsKey(s.charAt(i)) ? hashtable.get(s.charAt(i)) : 0;
            hashtable.put(s.charAt(i), value + 1);
        }

        System.out.println(hashtable);
    }

}