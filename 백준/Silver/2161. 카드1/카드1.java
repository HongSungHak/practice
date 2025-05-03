import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> dq = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for (int i = 1; i <= N; i++) {
            dq.addFirst(i);
        }
        while (true) {
            Integer last = dq.pollLast();
            sb.append(last).append(" ");
            if (dq.isEmpty()) {
                break;
            }
            Integer secondLast = dq.pollLast();
            dq.addFirst(secondLast);
        }
        System.out.println(sb);
    }
}
