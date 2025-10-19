import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Map<Integer, Integer> xMap = new HashMap<>();
        Map<Integer, Integer> yMap = new HashMap<>();
        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            xMap.put(x, xMap.getOrDefault(x, 0) + 1);
            yMap.put(y, yMap.getOrDefault(y, 0) + 1);
        }
        int x = xMap.keySet().stream().filter(i -> xMap.get(i) == 1).mapToInt(Integer::intValue)
                .findFirst().getAsInt();

        int y = yMap.keySet().stream().filter(i -> yMap.get(i) == 1).mapToInt(Integer::intValue)
                .findFirst().getAsInt();
        System.out.println(x + " " + y);
    }
}