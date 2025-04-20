import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        Map<Integer, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String request = st.nextToken();

            int number = 0;
            if (st.hasMoreTokens()) {
                number = Integer.parseInt(st.nextToken());
            }

            switch (request) {
                case "add":
                    map.put(number, 1);
                    break;
                case "remove":
                    map.remove(number);
                    break;
                case "check":
                    sb.append(map.containsKey(number) ? 1 : 0).append('\n');
                    break;
                case "toggle":
                    if (map.containsKey(number)) {
                        map.remove(number);
                    } else {
                        map.put(number, 1);
                    }
                    break;
                case "all":
                    for (int j = 1; j <= 20; j++) {
                        map.put(j, 1);
                    }
                    break;
                case "empty":
                    map.clear();
                    break;
            }
        }

        System.out.print(sb);
    }
}
