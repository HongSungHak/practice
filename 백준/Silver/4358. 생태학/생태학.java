import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Double> map = new HashMap<>();
        String line;
        int count = 0;
        while ((line = br.readLine()) != null && !line.isEmpty()) {
            map.put(line, map.getOrDefault(line, 0.0) + 1);
            count++;
        }

        int finalCount = count;
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(entry -> {
                    double percent = (entry.getValue() / finalCount) * 100;
                    System.out.printf("%s %.4f\n", entry.getKey(), percent);
                });
    }
}