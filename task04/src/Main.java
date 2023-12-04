public class Main {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.addFirst(10);
        list.addFirst(11);
        list.addFirst(12);
        list.addLast(13);
        list.addLast(14);
        list.addLast(15);
        list.addLast(16);
        list.removeFirst();
        list.removeLast();
        System.out.println(list.indexOf(12));
        System.out.println(list.contains(13));
        System.out.println(list.size());
        System.out.println(list.max());
        System.out.println(list.min());
        list.printElements();
    }
}
