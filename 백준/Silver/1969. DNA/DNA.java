import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[] dna = new String[N];
        for (int i = 0; i < N; i++) {
            dna[i] = br.readLine();
        }

        StringBuilder sb = new StringBuilder();
        int distance = 0;
        char[] chars = {'A', 'C', 'G', 'T'};

        for (int col = 0; col < M; col++) {
            int[] count = new int[4];

            for (int row = 0; row < N; row++) {
                char c = dna[row].charAt(col);
                if (c == 'A') count[0]++;
                else if (c == 'C') count[1]++;
                else if (c == 'G') count[2]++;
                else count[3]++;
            }

            int index = 0;
            for (int j = 1; j < 4; j++) {
                if (count[j] > count[index]) {
                    index = j;
                }
            }

            sb.append(chars[index]);
            distance += N - count[index];
        }

        System.out.println(sb);
        System.out.println(distance);
    }
}