import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        TreeMap<String, Boolean> map = new TreeMap<>();
        StringBuilder sb = new StringBuilder();

        int count = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 0; i < count; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String action = st.nextToken();

            if (action.equals("enter")) {
                map.put(name, true);
            } else { // leave
                map.remove(name);
            }
        }

        for (String name : map.descendingKeySet()) {
            sb.append(name).append("\n");
        }

        System.out.print(sb);
    }
}
