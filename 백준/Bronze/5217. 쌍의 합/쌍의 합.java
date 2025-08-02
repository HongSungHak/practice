import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int total = Integer.parseInt(br.readLine());
            int start = 1;
            int end = total - start;
            sb.append("Pairs for ").append(total).append(':').append(' ');
            while (start < end) {
                sb.append(start).append(" ").append(end);
                start++;
                end--;
                if (start < end) {
                    sb.append(", ");
                }
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}