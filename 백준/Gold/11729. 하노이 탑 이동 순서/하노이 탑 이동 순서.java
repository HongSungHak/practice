import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringJoiner;

public class Main {
    static StringJoiner sb = new StringJoiner("\n");
    static int count = 0;

    public static void hanoi(int n, int from, int to, int via) {
        if (n == 1) {
            sb.add(from + " " + to);
            count++;
            return;
        }

        hanoi(n - 1, from, via, to); // 1단계: n-1개를 보조기둥으로 이동
        sb.add(from + " " + to);     // 2단계: 가장 큰 원반을 목적지로 이동
        count++;
        hanoi(n - 1, via, to, from); // 3단계: 보조기둥의 원반들을 목적지로 이동
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        hanoi(n, 1, 3, 2); // 1번 기둥 → 3번 기둥, 2번은 보조

        System.out.println(count);
        System.out.println(sb);
    }
}
