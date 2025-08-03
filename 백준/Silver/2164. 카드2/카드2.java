import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 1; i <= N; i++) {
            dq.addFirst(i);
        }
        while (dq.size() > 1) {
            dq.removeLast();
            Integer lastNum = dq.pollLast();
            dq.addFirst(lastNum);
        }
        System.out.println(dq.getFirst());
    }
}