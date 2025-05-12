import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Map<String, Integer> map = new TreeMap<>();
        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split("\\.");
            map.put(input[1], map.getOrDefault(input[1], 0) + 1);
        }
        for (String s : map.keySet()) {
            sb.append(s).append(" ").append(map.get(s)).append("\n");
        }
        System.out.println(sb);
    }
}
