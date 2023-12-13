import java.util.NoSuchElementException;

public class StackLinkedList {
    private class Node{
        int value;
        Node button;

        public Node(int value) {
            this.value = value;
        }
    }
    Node top;

    public  boolean isEmpty(){
       return top==null;
    }
    public void push(int value){
        Node node =new Node(value);
        node.button=top;
        top=node;
    }

    public int peek(){
        if(isEmpty())
            throw new NoSuchElementException();
        return top.value;
    }

    public int pop(){
        if(isEmpty())
            throw new NoSuchElementException();
        Node temp=top;
        top=top.button;
        temp.button=null;
        return temp.value;
    }

}
