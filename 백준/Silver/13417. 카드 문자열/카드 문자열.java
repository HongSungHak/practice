import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        while (N-- > 0) {
            int T = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            Deque<Character> dq = new ArrayDeque<>();
            dq.addLast(st.nextToken().charAt(0));
            for (int i = 1; i < T; i++) {
                char c = st.nextToken().charAt(0);
                if (dq.peekFirst() < c) {
                    dq.addLast(c);
                } else {
                    dq.addFirst(c);
                }
            }
            dq.forEach(System.out::print);
            System.out.println();
        }

    }
}