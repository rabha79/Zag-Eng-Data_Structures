import java.util.NoSuchElementException;

public class LinkedList {
    private class Node {
        public Node(int v) {
            value = v;
        }

        int value;
        Node nextNode;
    }

    private Node first;
    private Node last;
    private int size = 0;

    public void addFirst(int item) {//O(1)
        Node node = new Node(item);//بكريت النود الجديده

        if (isEmpty()) {//في حالة مكانش في ولا نود
            first = last = node;
            size++;
            return;
        }
        node.nextNode = first;//بخلى النود الجديده تشاور على الهيد القديمه
        first = node;//هنا بحط على النود الجديده الهيد
        size++;
    }

    public void addLast(int item) {//O(1)
        Node node = new Node(item);
        if (isEmpty()) {
            first = last = node;
            size++;
            return;
        }
        last.nextNode = node;
        last = node;
        size++;
    }

    public void removeFirst() {//O(1)
        if (isEmpty()) {//لو معنديش عناصر خالص
            throw new NoSuchElementException("empty List");
        }
        if (first == last) {//لو هو عنصر واحد بس
            first = last = null;
            size--;
            return;
        }
        Node temp = first; //هحفظ اول عنصر عشان ارجع احذفه
        first = first.nextNode;
        temp.nextNode = null;
        size--;
    }

    public void removeLast() {//O(1)
        if (isEmpty()) {
            throw new NoSuchElementException("empty List");
        }
        if (first == last) {
            first = last = null;
            size--;
            return;
        }
        Node beforeList = getBeforeLast();
        last = beforeList;
        last.nextNode = null;
        size--;
    }

    private Node getBeforeLast() {//O(n)
        Node beforeList = first;
        Node current = first;

        while (current.nextNode != null) {
            beforeList = current;
            current = current.nextNode;
        }
        return beforeList;
    }

    private boolean isEmpty() {//O(1)

        return first == null;
    }

    public int indexOf(int item) {//o(n)

        Node current = first;
        int index = 0;

        while (current != null) {
            if (current.value == item)
                return index;
            index++;
            current = current.nextNode;
        }
        return -1;
    }

    public boolean contains(int value) {//O(1)
        int index = indexOf(value);

        return index != -1;
    }

    public int size() {//هترجع عدد العناصر في اللينكد ليست O(1)
        return size;
    }


    public int max() {//O(n)
        if (isEmpty()) {
            throw new NoSuchElementException("empty List");
        }

        int max = first.value;
        Node current = first.nextNode;

        while (current != null) {
            if (current.value > max) {
                max = current.value;
            }
            current = current.nextNode;
        }

        return max;
    }

    public int min() {//O(n)
        if (isEmpty()) {
            throw new NoSuchElementException("empty List");
        }

        int min = first.value;
        Node current = first.nextNode;

        while (current != null) {
            if (current.value < min) {
                min = current.value;
            }
            current = current.nextNode;
        }

        return min;
    }

    public void printElements() {//O(n)
        if (isEmpty()) {
            throw new NoSuchElementException("empty List");
        } else {
            Node current = first;
            while (current != null) {
                System.out.print(current.value + " ");
                current = current.nextNode;
            }
            System.out.println();
        }
    }
}
