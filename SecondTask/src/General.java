
import java.util.Random;
public class General {
    public static int integerReverse(int value){
        int reverse =0 ;
        while(value > 0){
            reverse = reverse * 10 + value % 10;
            value /= 10;
        }
        return reverse ;
    }

    public static int numberRandom(int value){
        return (int) (Math.random()*value);
    }

    public static int numberRandom(int min , int max){
        return (int) (min + ((max - min) * Math.random()));
    }
    public static char characterRandom(){
        Random letter = new Random();
        return (char)(letter.nextInt(26) + 'a');
    }

    public static <T> void arrayOfAnyType(T[] array){
        for(int i = 0 ; i<array.length ; i++ ){
            System.out.println(array[i]);
        }
    }

}

