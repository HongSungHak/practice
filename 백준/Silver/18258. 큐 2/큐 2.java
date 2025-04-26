import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayDeque<Integer> q = new ArrayDeque<>();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            switch (st.nextToken()) {
                case "push":
                    int num = Integer.parseInt(st.nextToken());
                    q.add(num);
                    break;
                case "pop":
                    sb.append(!q.isEmpty() ? q.poll() : -1).append('\n');
                    break;
                case "size":
                    sb.append(q.size()).append('\n');
                    break;
                case "empty":
                    sb.append(q.isEmpty() ? 1 : 0).append('\n');
                    break;
                case "front":
                    sb.append(!q.isEmpty() ? q.getFirst() : -1).append('\n');
                    break;
                case "back":
                    sb.append(!q.isEmpty() ? q.getLast() : -1).append('\n');
                    break;
            }
        }

        System.out.print(sb);
    }
}
