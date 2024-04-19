public class Main {
    public static void main(String[] args) {
        Tree tree1 = new Tree();
        tree1.insert(7);
        tree1.insert(4);
        tree1.insert(9);
        tree1.insert(8);
        tree1.insert(10);
        tree1.insert(6);
        tree1.insert(1);


//        Tree tree2 = new Tree();
//        tree2.insert(7);
//        tree2.insert(4);
//        tree2.insert(9);
//        tree2.insert(80);
//        tree2.insert(10);
//        tree2.insert(6);
//        tree2.insert(1);
//
//        System.out.println(tree1.equals(tree2));

        tree1.levelOrder();


    }
}