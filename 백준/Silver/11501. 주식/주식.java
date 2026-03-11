import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T --> 0) {
            int N = sc.nextInt();

            int[] arr = new int[N];

            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }

            long sum = 0;

            int max = arr[N - 1];
            for (int i = N - 2; i >= 0; i--) {
                if (arr[i] < max) {
                    sum += max - arr[i];
                } else {
                    max = arr[i];
                }
            }
            System.out.println(sum);
        }
    }
}
