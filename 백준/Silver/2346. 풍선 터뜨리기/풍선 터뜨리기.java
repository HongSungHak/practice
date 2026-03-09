import java.io.*;
import java.util.*;

public class Main {

    static class Balloon {
        int idx;
        int move;

        Balloon(int idx, int move) {
            this.idx = idx;
            this.move = move;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        Deque<Balloon> dq = new ArrayDeque<>();

        for (int i = 1; i <= N; i++) {
            dq.offerLast(new Balloon(i, Integer.parseInt(st.nextToken())));
        }

        StringBuilder sb = new StringBuilder();

        while (!dq.isEmpty()) {
            Balloon cur = dq.pollFirst();
            sb.append(cur.idx).append(' ');

            if (dq.isEmpty()) break;

            if (cur.move > 0) {
                for (int i = 0; i < cur.move - 1; i++) {
                    dq.offerLast(dq.pollFirst());
                }
            } else {
                for (int i = 0; i < -cur.move; i++) {
                    dq.offerFirst(dq.pollLast());
                }
            }
        }

        System.out.println(sb);
    }
}