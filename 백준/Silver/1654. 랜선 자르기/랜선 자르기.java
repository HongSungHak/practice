import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, K;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        K = Integer.parseInt(st.nextToken()); //랜선의 개수
        N = Integer.parseInt(st.nextToken()); // 필요한 랜선 수
        int max = Integer.MIN_VALUE;
        arr = new int[K];
        for (int i = 0; i < K; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        long low = 1;
        long hight = max;
        long result = 0;

        while (low <= hight) {
            long mid = low + (hight - low) / 2;

            long count = 0;
            for (int cableLength : arr) {
                count += (cableLength / mid);
            }

            if (count >= N) {
                result = count;
                low = mid + 1;
            } else {
                hight = mid - 1;
            }
        }
        System.out.println(hight);
    }
}