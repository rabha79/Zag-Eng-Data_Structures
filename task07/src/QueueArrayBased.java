import java.util.Arrays;
import java.util.NoSuchElementException;

public class QueueArrayBased {
    int [] items;
    int size =0;
    int count =0;
    int first=0;
    int last=0;

    public QueueArrayBased(int size) {
        this.size = size;
        items = new int[size];
    }
    public boolean isEmpty(){ // O(1)هتكون فاضيه امتى
        return count == 0;
    }
    public boolean isFull(){ //هتكون مليانه امتى O(1)
        return count == size;
    }
    public void enqueue(int item){//O(1)
        if(isFull())
            throw new NoSuchElementException("it is Full");

        items[last] = item; //لما اجي ادخل حاجه بدخلها في المكان اللي بيشاور عليه اللاست
        last = (last+1)%size; // لما تتملي كلها اللاست هيقف بره فكان لازم يرجع في الاول مكان العناصر اللي اتحذفت
        count++; // بزود الكونت عشان في عنصر دخل
    }
    public int dequeue(){ //بترجع عنصر وتحذفه O(1)
        if(isEmpty())
            throw new NoSuchElementException("it is Empty");
        int temp= items[first]; //بحط اول عنصر في متغير
        items[first]=0; // بخلي اول عنصر بيساوي صفر عشان الديفولت بتاع الاري بيبقى فيه صفر لما ميكونش في عناصر وبكده انا حذفتها
        first = (first+1)%size; // بحرك الفيرست هتبقى على العنصر اللي بعدها ولما احذف كذا عنصر وادخل مكانهم عناصر الفيرست ترجع في الاول مكانها بس لما احذف كل العناصر
        count--; // والكونت هيقل عشان حذفنا عنصر
        return temp;
    }
    public void print(){ // بنطبع العناصر اللي في queue O(n)
        System.out.print("[");

        if (!isEmpty()){ //لو هي مش فاضيه
            System.out.print(items[first]); // اطبع اول عنصر لوحده

            int current = (first + 1) % size;
            while (current != last){
                System.out.print(", " + items[current]);
                current = (current + 1) % size;
            }
        }
        System.out.println("]");
    }






}
