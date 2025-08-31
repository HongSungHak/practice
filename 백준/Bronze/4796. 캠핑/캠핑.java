import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int i = 1;
        while (true) {
            st = new StringTokenizer(br.readLine());
            int L = Integer.parseInt(st.nextToken()); // 사용 가능일
            int P = Integer.parseInt(st.nextToken()); // 연속하는 일
            int V = Integer.parseInt(st.nextToken()); // 휴가일 수

            // 종료 조건
            if (L == 0 && P == 0 && V == 0) {
                break;
            }

            int availableCount = (V / P) * L;

            int remainingDays = V % P;
            availableCount += Math.min(remainingDays, L);

            System.out.println("Case " + i + ": " + availableCount);
            i++;
        }
    }
}