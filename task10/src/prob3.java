import java.util.HashMap;

public class prob3 {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 3, 3, 4};

        HashMap<Integer, Integer> hashtable = new HashMap<>();

        for (int num : array) {
            int value = hashtable.containsKey(num) ? hashtable.get(num) : 0;
            hashtable.put(num, value + 1);
        }

        int mostRepeated = findMostRepeated(hashtable);
        System.out.println("Most repeated element: " + mostRepeated);
    }

    public static int findMostRepeated(HashMap<Integer, Integer> hashtable) {
        int mostRepeated = -1;
        int maxCount = Integer.MIN_VALUE;

        for (int key : hashtable.keySet()) {
            int count = hashtable.get(key);
            if (count > maxCount) {
                mostRepeated = key;
                maxCount = count;
            }
        }

        return mostRepeated;
    }
}

