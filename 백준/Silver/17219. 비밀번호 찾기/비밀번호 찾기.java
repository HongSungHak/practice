import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> map = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String id = st.nextToken();
            String password = st.nextToken();
            map.put(id, password);
        }
        for (int i = 0; i < M; i++) {
            String id = br.readLine();
            String findPassword = map.get(id);
            sb.append(findPassword).append("\n");
        }
        System.out.println(sb);
    }
}
