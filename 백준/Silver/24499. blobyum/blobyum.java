import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] pie = new int[N * 2];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            pie[i] = Integer.parseInt(st.nextToken());
            pie[i + N] = pie[i];  // 원형 처리: 배열 두 배로 확장
        }

        long sum = 0;
        // 첫 윈도우 초기화 (0 ~ K-1)
        for (int i = 0; i < K; i++) {
            sum += pie[i];
        }

        long max = sum;

        // 슬라이딩 윈도우 이동: 총 N번 이동
        for (int i = 1; i < N; i++) {
            sum = sum - pie[i - 1] + pie[i + K - 1];
            if (sum > max) max = sum;
        }

        System.out.println(max);
    }
}
