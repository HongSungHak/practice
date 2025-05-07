import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int fruit = Integer.parseInt(st.nextToken());
        int bird = Integer.parseInt(st.nextToken());

        int[] heights = Arrays.stream(br.readLine().split(" "))
                              .mapToInt(Integer::parseInt)
                              .toArray();

        Arrays.sort(heights);

        for (int height : heights) {
            if (height > bird) break;
            bird++;
        }

        System.out.println(bird);
    }
}
