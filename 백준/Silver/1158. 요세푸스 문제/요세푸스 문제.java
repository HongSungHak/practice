import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 숫자 총 개수
        int M = Integer.parseInt(st.nextToken()); // 시작 배수

        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        StringBuilder sb = new StringBuilder("<");

        while (queue.size() > 1) {
            for (int i = 0; i < M - 1; i++) {
                queue.add(queue.poll());
            }
            sb.append(queue.poll()).append(", ");
        }

        sb.append(queue.poll()).append(">");

        System.out.println(sb);
    }
}