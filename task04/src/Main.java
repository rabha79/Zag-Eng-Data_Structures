public class Main {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.addFirst(10);
        list.addFirst(11);
        list.addFirst(15);
        list.addLast(10);
        list.addLast(11);
        list.addLast(12);
        list.addLast(13);
        list.removeFirst();
        list.removeLast();
        System.out.println(list.indexOf(12));
        System.out.println(list.contains(13));
        System.out.println(list.size());
    }
}