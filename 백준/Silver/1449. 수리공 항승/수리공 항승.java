import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 물이 새는 곳의 개수
        int M = Integer.parseInt(st.nextToken()); // 테이프의 길이

        // 물이 새는 곳이 0개인 경우 테이프는 필요 없음
        if (N == 0) {
            System.out.println(0);
            return;
        }

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 물이 새는 위치를 오름차순으로 정렬
        Arrays.sort(arr);

        int count = 1; // 첫 번째 테이프는 무조건 필요
        double start = arr[0] - 0.5; // 테이프를 붙이는 시작점
        double end = start + M;      // 테이프가 커버하는 끝점

        for (int i = 1; i < N; i++) {
            if (arr[i] > end) {
                count++;
                start = arr[i] - 0.5;
                end = start + M;
            }
        }

        System.out.println(count);
    }
}