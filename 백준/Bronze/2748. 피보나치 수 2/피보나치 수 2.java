import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    static int N;
    static long[] dp;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        dp = new long[N+1];
        for (int i = 0; i < N+1; i++) {
            dp[i] = -1;
        }
        dp[0] = 0;
        dp[1] = 1;

        bw.write(Fib(N) + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
    private static long Fib(int N) {
        if(dp[N] == -1)dp[N] = Fib(N-1) + Fib(N-2);
        return dp[N];
    }
}