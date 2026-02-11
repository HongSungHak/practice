import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        int[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] sorted = Arrays.stream(arr)
                .distinct()
                .sorted()
                .toArray();

        Map<Integer, Integer> map = IntStream.range(0, sorted.length)
                .boxed()
                .collect(Collectors.toMap(
                        i -> sorted[i],
                        i -> i           
                ));

        StringBuilder sb = new StringBuilder();
        for (int x : arr) {
            sb.append(map.get(x)).append(' ');
        }
        System.out.println(sb);
    }
}