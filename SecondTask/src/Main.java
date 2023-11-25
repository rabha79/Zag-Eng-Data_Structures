

public class Main {
    public static void main(String[] args) {
        int reverse = General.integerReverse(3456);
        System.out.println(reverse);

        int random = General.numberRandom(10);
        System.out.println(random);

        int random1 = General.numberRandom(5,10);
        System.out.println(random1);

        char randomChar = General.characterRandom();
        System.out.println(randomChar);

        String[] array = {"aaaaa", "bhftd", "htftyrers"};
        General.arrayOfAnyType(array);




    }
}