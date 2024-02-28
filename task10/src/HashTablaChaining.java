import java.util.LinkedList;
import java.util.NoSuchElementException;

public class HashTablaChaining {
    private class Node {
        private int key;
        private String value;

        public Node(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<Node>[] table;
    private int count;

    public HashTablaChaining(int value) {
        table = new LinkedList[value];
        count = 0;
    }

    private int hash(int key) {
        return key % table.length;
    }

    public void put(int key, String value) {
        Node node = new Node(key, value);

        int index = hash(key);

        if (table[index] == null)
            table[index] = new LinkedList<>();

        for (Node e : table[index])
            if (e.key == key) {
                e.value = value;
                return;
            }

        table[index].add(node);
        count++;
    }

    public String get(int key) {
        int index = hash(key);

        if (table[index] == null)
            return null;
        else {
            for (Node e : table[index]) {
                if (e.key == key)
                    return e.value;
            }
        }

        return null;
    }

    public void delete(int key) {
        int index = hash(key);

        if (table[index] == null)
            throw new NoSuchElementException("the key not exist");
        else {
            for (Node e : table[index]) {
                if (e.key == key) {
                    table[index].remove(e);
                    count--;
                    return;
                }
            }
        }

        throw new NoSuchElementException("the key not exist");
    }

    public int size() {
        return count;
    }
}

