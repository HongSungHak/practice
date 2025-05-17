import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());

        int M = Integer.parseInt(st.nextToken());

        Map<String, Integer> keyMap = new HashMap<>();
        Map<Integer, String> valueMap = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < N; i++) {
            String pokemon = br.readLine();
            keyMap.put(pokemon, i+1);
            valueMap.put(i+1, pokemon);
        }
        for (int i = 0; i < M; i++) {
            String word = br.readLine();
            if (isNumeric(word)) {
                int key = Integer.parseInt(word);
                sb.append(valueMap.get(key)).append("\n");
            } else{
                sb.append(keyMap.get(word)).append("\n");
            }
        }

        System.out.println(sb);
    }

    private static boolean isNumeric(String s) {
        return s.chars().allMatch(Character::isDigit);
    }
}
