import java.util.NoSuchElementException;

public class linkedListG<E>{
    private class Node {
        public Node( E v) {
            value = v;
        }

        private E value;
        private Node nextNode;
    }

    private Node first;
    private Node last;
    private int size = 0;

    public void addFirst(E item) {//O(1)
        Node node = new Node(item);

        if (isEmpty()) {
            first = last = node;
            size++;
            return;
        }
        node.nextNode = first;
        first = node;
        size++;
    }

    public void addLast(E item) {//O(1)
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
        if (isEmpty()) {
            throw new NoSuchElementException("empty List");
        }
        if (first == last) {
            first = last = null;
            size--;
            return;
        }
        Node temp = first;
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

    public int indexOf(E item) {//o(n)

        Node current = first;
        int index = 0;

        while (current != null) {
            if (current.value.equals(item))
                return index;
            index++;
            current = current.nextNode;
        }
        return -1;
    }

    public boolean contains(E value) {//O(1)
        int index = indexOf(value);

        return index != -1;
    }

    public int size() {// O(1)

        return size;
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



    public void reverse() {
        if (isEmpty())
            return;
        Node previous = first;
        Node current = first.nextNode;

        while (current != null) {
            Node next = current.nextNode;
            current.nextNode = previous;
            previous = current;
            current = next;

        }
        Node temp = first;
        first = last;
        last = temp;
        last.nextNode = null;
    }
}
