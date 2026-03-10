import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Deque<String> dq1 = new ArrayDeque<>();

        Deque<String> dq2 = new ArrayDeque<>();

        StringTokenizer st;

        for (String s : br.readLine().split("")) {
            dq1.addLast(s);
        }

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();

            if (cmd.equals("P")) {
                String s = st.nextToken();
                dq1.addLast(s);
            } else if (cmd.equals("L") && !dq1.isEmpty()) {
                String alphabet = dq1.pollLast();
                dq2.addLast(alphabet);
            } else if (cmd.equals("B") && !dq1.isEmpty()) {
                dq1.pollLast();
            } else if (cmd.equals("D") && !dq2.isEmpty()) {
                String alphabet = dq2.pollLast();
                dq1.addLast(alphabet);
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!dq1.isEmpty()) {
            sb.append(dq1.pollFirst());
        }
        while (!dq2.isEmpty()) {
            sb.append(dq2.pollLast());
        }
        System.out.println(sb);
    }
}
