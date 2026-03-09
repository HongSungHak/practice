import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        Deque<int[]> dq = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            int step = Integer.parseInt(st.nextToken());
            dq.addFirst(new int[]{i, step});
        }
        while (!dq.isEmpty()) {

            int[] num = dq.pollLast();
            int idx = num[0];
            int step = num[1];

            sb.append(idx).append(" ");

            if (dq.isEmpty()) break;

            if (step > 0) {
                for (int i = 0; i < step - 1; i++) {
                    int[] ballon = dq.pollLast();
                    dq.addFirst(ballon);
                }
            } else {
                step *= -1;
                for (int i = 0; i < step; i++) {
                    int[] ballon = dq.pollFirst();
                    dq.addLast(ballon);
                }
            }
        }
        System.out.println(sb);
    }
}
