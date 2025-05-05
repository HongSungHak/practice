import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            long zeroCount = 0;
            st = new StringTokenizer(br.readLine(), " ");
            int startNum = Integer.parseInt(st.nextToken());
            int endNum = Integer.parseInt(st.nextToken());
            while (startNum <= endNum) {
                long count = String.valueOf(startNum)
                                   .chars()
                                   .filter(c -> c == '0')
                                   .count();
                zeroCount += count;
                startNum++;
            }
            sb.append(zeroCount).append("\n");
        }
        System.out.println(sb);
    }
}
