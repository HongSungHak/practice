import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            int K = Integer.parseInt(st.nextToken());
            List<Integer> scores = new ArrayList<>();

            for (int j = 0; j < K; j++) {
                scores.add(Integer.parseInt(st.nextToken()));
            }

            Collections.sort(scores);

            int max = scores.stream()
                    .mapToInt(Integer::intValue)
                    .max()
                    .getAsInt();

            int min = scores.stream()
                    .mapToInt(Integer::intValue)
                    .min()
                    .getAsInt();

            int gap = 0;
            for (int j = 1; j < scores.size(); j++) {
                int currentGap = scores.get(j) - scores.get(j - 1);
                if (currentGap > gap) {
                    gap = currentGap;
                }
            }

            System.out.println("Class " + i);
            System.out.println("Max " + max + ", Min " + min + ", Largest gap " + gap);
        }
        br.close();
    }
}