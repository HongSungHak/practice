import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        TreeMap<String, Integer> map = new TreeMap<>();
        int count = Integer.parseInt(br.readLine());
        for (int i = 0; i < count; i++) {
            String bookName = br.readLine();
            map.put(bookName, map.getOrDefault(bookName, 0) + 1);
        }
        String mostFrequentBook = map.entrySet().stream().min((e1, e2) -> {
                    int cmp = Integer.compare(e2.getValue(), e1.getValue()); // value 내림차순
                    if (cmp == 0) {
                        return e1.getKey().compareTo(e2.getKey()); // key 오름차순
                    }
                    return cmp;
                })
                .get()
                .getKey();

        System.out.println(mostFrequentBook);
    }
}
