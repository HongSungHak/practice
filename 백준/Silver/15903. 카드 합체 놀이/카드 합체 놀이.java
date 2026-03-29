import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long N = Long.parseLong(st.nextToken());
        long T = Long.parseLong(st.nextToken());
        PriorityQueue<Long> pq = new PriorityQueue<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            pq.add(Long.parseLong(st.nextToken()));
        }
        while (T --> 0) {
            long a = pq.poll();
            long b = pq.poll();
            long sum = a + b;
            pq.offer(sum);
            pq.offer(sum);
        }
        long total = 0;
        while (!pq.isEmpty()) {
            total += pq.poll();
        }
        System.out.println(total);
    }
}