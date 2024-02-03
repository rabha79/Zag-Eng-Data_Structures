import java.util.NoSuchElementException;

public class priorityQueue {
    private int count = 0;
    private int size =0;
    final private int[] array;
    public priorityQueue(int size){
        this.size =size;
        array = new int[size];
    }
    public void insert (int item){//O(1)
        if (isFull())
            throw new NoSuchElementException("the queue is full");
        int i = getIndex(item);
        array[i] = item;
        count++;
    }
    private int getIndex(int item){//O(n)
        int i= count -1; // ببدا من الاخر هنا عشان في مقارنه
        for (;i>=0;i--){
            if(array[i]>item)
                array[i+1] = array[i];
            else
                break;
        }
        return i+1;
    }
    public boolean isEmpty(){//O(1)
        return count ==0;
    }
    public boolean isFull(){//O(1)
        return count == size;
    }

}
