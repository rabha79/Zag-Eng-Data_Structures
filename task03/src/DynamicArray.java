public class DynamicArray {
    int[] items;
    int size = 0;
    int count = 0; // (عدد العناصر في الاري) ليه استخدمنا كونت عشان اليوز احتمال مش يدخل حجم الاري كامل

    public DynamicArray(int n) {
        size = n;
        items = new int[size];
    }

    public DynamicArray() {
        size = 100;
        items = new int[size];
    }

    public void printArray() {
        for (int i = 0; i < count; i++)
            System.out.print(items[i] + " ");
        System.out.println();
    }

    public void insert(int item) {//ازود عدد القيم في الاري
        if (count == size)
            createArray();
        items[count] = item;
        count++;
    }

    private void createArray() { // بنسخ القديم في الاري الجديده ويديني عنونها
        size = size * 2;
        int[] newArray = new int[size];
        for (int i = 0; i < count; i++)
            newArray[i] = items[i];
        items = newArray;
    }

    public void removeAt(int index) {//حذف عنصر من الاري ونقص حجم الاري
        if (index < 0 || index > count)//لازم اتاكد ان اليوز مش هيدخل حاجه اعلى من الكونت او سالب مثلا
            throw new IllegalStateException("not valid index");
        for (int i = index; i < count - 1; i++)
            items[i] = items[i + 1];
        count--;
    }

    public int indexOf(int item) {// ببحث عن عنصر في الاري وترجعلي الاندكس بتاعه لو موجود
        for (int i = 0; i < count; i++)
            if (item == items[i])
                return i;
        return -1;
    }

    public int at(int index) {//اديها الاندكس ترجعلي القيمه اللي جوه الاندكس بكام
        for (int i = 0; i < count; i++)
            if (index == i)
                return items[index];
        return -1;
    }

    public int max() {//بترجع اكبر قيمه في الاري بتاعتي
        int max = items[0];
        for (int i = 0; i < count; i++)
            if (items[i] > max)
                max = items[i];
        return max;
    }

    public int min() {//بترجع اصغر قيمه في الاري
        int min = items[0];
        for (int i = 0; i < count; i++)
            if (items[i] < min)
                min = items[i];
        return min;
    }


    public void remove(int item) {//الفرق بينها وبين التانيه التانيه ببعتلها اندكس لكن دي ببعت العنصر نفسه
        int index = indexOf(item);//هنا بتاكد ان العنصر موجود وكمان برجع الاندكس بتاعه
        if (index != -1)
            removeAt(index);
        else
            throw new IllegalStateException("not valid item");

    }
}
