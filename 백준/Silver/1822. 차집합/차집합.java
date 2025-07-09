import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int firstSetCount = Integer.parseInt(st.nextToken());
        int secondSetCount = Integer.parseInt(st.nextToken());

        Set<Integer> uniqueElements = new HashSet<>();

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < firstSetCount; i++) {
            if (st.hasMoreTokens()) {
                uniqueElements.add(Integer.parseInt(st.nextToken()));
            } else {
                break;
            }
        }

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < secondSetCount; i++) {
            if (st.hasMoreTokens()) {
                uniqueElements.remove(Integer.parseInt(st.nextToken()));
            } else {
                break;
            }
        }

        System.out.println(uniqueElements.size());

        if (!uniqueElements.isEmpty()) {
            System.out.println(uniqueElements.stream()
                                             .sorted()
                                             .map(String::valueOf)
                                             .collect(Collectors.joining(" ")));
        }
    }
}