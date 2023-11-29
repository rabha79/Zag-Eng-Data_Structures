import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        DynamicArray array = new DynamicArray(2);
        array.insert(10);
        array.insert(20);
        array.insert(30);
        array.insert(40);
        array.insert(50);
        array.printArray();
        array.removeAt(4);
        array.printArray();
//      array.removeAt(10);
//      array.printArray();
        System.out.println(array.indexOf(30));
        System.out.println(array.indexOf(100));
        System.out.println(array.at(2));
        System.out.println(array.at(10));
        System.out.println(array.max());
        System.out.println(array.min());
        array.remove(30);
        array.printArray();
//      array.remove(100);


    }
}