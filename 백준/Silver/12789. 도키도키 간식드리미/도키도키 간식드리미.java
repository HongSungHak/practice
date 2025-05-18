import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Deque<Integer> dq = new ArrayDeque<>();
        Stack<Integer> waitStack = new Stack<>();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            dq.addFirst(num);  // 역순 저장
        }

        int index = 1;
        while (!dq.isEmpty() || (!waitStack.isEmpty() && waitStack.peek() == index)) {
            if (!dq.isEmpty() && dq.getLast() == index) {
                dq.removeLast();
                index++;
            } else if (!waitStack.isEmpty() && waitStack.peek() == index) {
                waitStack.pop();
                index++;
            } else if (!dq.isEmpty()) {
                waitStack.push(dq.removeLast());
            } else {
                break;  // 더 이상 진행 불가
            }
        }

        if (index == N + 1) {
            System.out.println("Nice");
        } else {
            System.out.println("Sad");
        }
    }
}
