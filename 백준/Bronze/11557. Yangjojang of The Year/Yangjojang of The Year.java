import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        while (N --> 0) {
            int max = 0;
            int universitys = Integer.parseInt(br.readLine());
            Map<String, Integer> map = new HashMap<>();
            String university = "";
            for (int i = 0; i < universitys; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                map.put(st.nextToken(), Integer.parseInt(st.nextToken()));
            }
            for (String value : map.keySet()) {
                if (max < map.get(value)) {
                    max = map.get(value);
                    university = value;
                }
            }
            System.out.println(university);
        }
    }
}