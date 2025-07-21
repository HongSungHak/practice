import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int i = 0 ; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int countLeft = 0;
        if (N > 0) {
            countLeft = 1;
            int maxHeightFromLeft = arr[0];

            for (int i = 1; i < N; i++) {
                if (arr[i] > maxHeightFromLeft) {
                    countLeft++;
                    maxHeightFromLeft = arr[i];
                }
            }
        }

        int countRight = 0;
        if (N > 0) {
            countRight = 1;
            int maxHeightFromRight = arr[N - 1];

            for (int i = N - 2; i >= 0; i--) {
                if (arr[i] > maxHeightFromRight) {
                    countRight++;
                    maxHeightFromRight = arr[i];
                }
            }
        }

        System.out.println(countLeft);
        System.out.println(countRight);
    }
}