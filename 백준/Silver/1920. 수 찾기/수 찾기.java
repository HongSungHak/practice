import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            int target = Integer.parseInt(st.nextToken());

            if (binarySearch(arr, target)) {
                sb.append(1).append('\n');
            } else {
                sb.append(0).append('\n');
            }
        }

        System.out.print(sb);
    }

    public static boolean binarySearch(int[] arr, int target) {
        int startIdx = 0;
        int endIdx = arr.length - 1;

        while (startIdx <= endIdx) {
            int midIdx = (startIdx + endIdx) / 2;
            int midNum = arr[midIdx];

            if (midNum < target) {
                startIdx = midIdx + 1;
            } else if (midNum > target) {
                endIdx = midIdx - 1;
            } else {
                return true; // 찾았을 경우 즉시 true 반환
            }
        }

        return false;
    }
}