import java.util.Scanner;

public class prob1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] Array = new int[N];
        int[] freqArray = new int[M + 1];
        for (int i = 0; i < N; i++) {
            Array[i] = scanner.nextInt();
            freqArray[Array[i]]++;
        }
        for (int i = 1; i <= M; i++) {
            System.out.println(freqArray[i]);
        }
    }
}
