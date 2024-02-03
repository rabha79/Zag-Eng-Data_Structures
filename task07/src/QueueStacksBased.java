import java.util.NoSuchElementException;
import java.util.Stack;

public class QueueStacksBased {
    private final Stack<Integer> stack1 = new Stack<>();
    private final Stack<Integer> stack2 = new Stack<>();

    public void enqueue(int item){
        stack1.push(item);
    }
    public int dequeue(){//O(1)
        if(isEmpty())
            throw new NoSuchElementException("Queue is empty");
        if(stack2.isEmpty())
            moveStackOneToStackTwo();
        return stack2.pop();
    }
    public int peek(){//O(1)
        if (isEmpty())
            throw new NoSuchElementException("Queue is empty");
        if (stack2.isEmpty())
            moveStackOneToStackTwo();
        return stack2.peek();
    }

    public boolean isEmpty(){//O(1)
        return stack1.isEmpty()&&stack2.isEmpty();
    }
    private void moveStackOneToStackTwo(){//O(n)
        while (!stack1.isEmpty())
            stack2.push(stack1.pop());
    }
}
