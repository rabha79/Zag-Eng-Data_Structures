import java.util.LinkedList;
import java.util.NoSuchElementException;

public class QueueLinkedList {
    private final LinkedList<Integer> list = new LinkedList<>();

    public void enqueue(int item) { //O(1)
        list.addLast(item);
    }

    public int dequeue() { //O(1)
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return list.removeFirst();
    }

    public int peek() { //O(1)
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return list.getFirst();
    }

    public boolean isEmpty() { //O(1)
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }
}

