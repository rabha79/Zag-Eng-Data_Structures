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
}
