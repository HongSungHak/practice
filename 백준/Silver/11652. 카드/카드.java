import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Long, Integer> map = new TreeMap<>();
        int num = Integer.parseInt(br.readLine());
        for (int i = 0; i < num; i++) {
            Long key = Long.parseLong(br.readLine());
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        long key = map.entrySet().stream()
                .max((a, b) -> {
                    int cmp = Integer.compare(a.getValue(), b.getValue()); // 빈도 비교
                    if (cmp == 0) {
                        return Long.compare(b.getKey(), a.getKey()); // 빈도 같으면 더 작은 키 우선
                    }
                    return cmp;
                })
                .orElseThrow()
                .getKey();

        System.out.println(key);
    }
}
