import java.util.Stack;

public class Main {
    public static void main(String[] args) {

       QueueArrayBased queue =new QueueArrayBased(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.print();
        reverse(queue);
        queue.print();

    }
    public static void reverse (QueueArrayBased queue){
        Stack<Integer> stack = new Stack <>();

        while (!queue.isEmpty())
            stack.push(queue.dequeue());
        while(!stack.isEmpty())
            queue.enqueue(stack.pop());

    }
}