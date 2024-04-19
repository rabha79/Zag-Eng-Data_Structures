import java.util.ArrayList;

public class Tree {
    private class Node {
        private int value;
        private Node rightChild;
        private Node leftChild;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    public void insert(int value) {
        Node node = new Node(value);
        if (root == null)
            root = node;
        else {
            Node parent = getParent(value);
            if (value >= parent.value)
                parent.rightChild = node;
            else
                parent.leftChild = node;
        }
    }

    private Node getParent(int value) {
        Node current = root;
        Node parent = root;

        while (current != null) {
            parent = current;
            if (value >= current.value)
                current = current.rightChild;
            else
                current = current.leftChild;
        }

        return parent;
    }

    public boolean find(int value) {
        Node current = root;

        while (current != null) {
            if (current.value == value)
                return true;
            if (value > current.value)
                current = current.rightChild;
            else
                current = current.leftChild;
        }

        return false;
    }

    public int max() {
        int max = root.value;
        Node current = root;

        while (current != null) {
            max = current.value;
            current = current.rightChild;
        }

        return max;
    }

    public void preOrder() {
        preOrder(root);
    }

    public void inOrder() {
        inOrder(root);
    }

    public void postOrder() {
        postOrder(root);
    }

    public void preOrder(Node root) {
        if (root == null)
            return;
        System.out.println(root.value);
        preOrder(root.leftChild);
        preOrder(root.rightChild);
    }

    public void inOrder(Node root) {
        if (root == null)
            return;
        preOrder(root.leftChild);
        System.out.println(root.value);
        preOrder(root.rightChild);
    }

    public void postOrder(Node root) {
        if (root == null)
            return;
        preOrder(root.leftChild);
        preOrder(root.rightChild);
        System.out.println(root.value);
    }
    public void printDescendingOrder() {
        printDescendingOrder(root);
    }

    private void printDescendingOrder(Node root) {
        if (root == null)
            return;

        printDescendingOrder(root.rightChild);
        System.out.println(root.value);
        printDescendingOrder(root.leftChild);
    }

    public int min() {
        if (root == null) {
            throw new IllegalStateException("The tree is empty.");
        }

        Node current = root;
        while (current.leftChild != null) {
            current = current.leftChild;
        }

        return current.value;
    }


    public int height(){
        return height(root);
    }
    private boolean isLeaf(Node node){
        return node.leftChild == null&&node.rightChild == null;
    }
    private int height(Node root){
        if(root==null)
            return -1;
        if(isLeaf(root))
            return 0;
        return 1+Math.max(height(root.leftChild),height(root.rightChild));
    }
    public boolean equals(Tree tree){
        return equals(root,tree.root);
    }

    private boolean equals(Node root1, Node root2){
        if(root1==null&&root2==null)
            return true;

        if(root1!=null&&root2!=null)
            return root1.value==root2.value
                    &&equals(root1.rightChild,root2.rightChild)
                    &&equals(root1.leftChild,root2.leftChild);

        return false;
    }

    public ArrayList<Integer> KthElementFromRoot(int distance){
        var arrayList=new ArrayList<Integer>();
        KthElementFromRoot(root,distance, arrayList);

        return arrayList;
    }

    private void KthElementFromRoot(Node root, int distance, ArrayList<Integer> arrayList){
        if(root == null)
            return;


        if(distance==0){
            arrayList.add(root.value);
            return;
        }

        KthElementFromRoot(root.leftChild,distance - 1,arrayList);
        KthElementFromRoot(root.rightChild,distance - 1,arrayList);

    }



    public void levelOrder(){
        for(int i = 0; i <= height();i++){
            var list = KthElementFromRoot(i);
            System.out.println(list);
        }
    }







}

