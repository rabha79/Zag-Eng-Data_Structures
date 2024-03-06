import java.util.LinkedList;
import java.util.NoSuchElementException;

public class HashTablaChaining <K,V>{
    private class Entry {
        private K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<Entry>[] table;
    private int count;

    public HashTablaChaining(int value) {
        table = (LinkedList<Entry>[]) new LinkedList[value];
        count = 0;
    }

    private int hash(K key) {
        return key.hashCode() % table.length;
    }

    public void put(K key, V value) {
        Entry entry = new Entry(key, value);

        int index = hash(key);

        if (table[index] == null)
            table[index] = new LinkedList<>();

        for (Entry e : table[index])
            if (e.key == key) {
                e.value = value;
                return;
            }

        table[index].add(entry);
        count++;
    }

    public V get(K key) {
        int index = hash(key);

        if (table[index] == null)
            return null;
        else {
            for (Entry e : table[index]) {
                if (e.key == key)
                    return e.value;
            }
        }

        return null;
    }

    public void delete(K key) {
        int index = hash(key);

        if (table[index] == null)
            throw new NoSuchElementException("the key not exist");
        else {
            for (Entry e : table[index]) {
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

