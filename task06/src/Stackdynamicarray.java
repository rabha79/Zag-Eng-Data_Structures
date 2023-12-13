import java.util.NoSuchElementException;

public class Stackdynamicarray {
    int [] items;
    int size=0;
    int count =0;//عدد العناصر

    public Stackdynamicarray(int size){
        this.size=size;
        items=new int[size];
    }

    public Stackdynamicarray(){
        size = 100;
        items = new int[size];
    }

    public boolean isEmpty(){
        return count==0;
    }

    public void push(int value){
        if(size==count)
            createNewArray();
        items[count]=value;
        count++;
    }

    public int pop(){
        if(isEmpty())
            throw new NoSuchElementException();
        int temp = items[count-1];
        count--;
        return temp;

    }

    public int peek(){
        if(isEmpty())
            throw new NoSuchElementException();

        return items[count - 1];
    }


    private void createNewArray() {
        int [] newArray =new int[size];
        for(int i=0;i<count;i++)
            newArray[i]=items[i];
        items=newArray;
    }
}
