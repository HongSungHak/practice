import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        long sum = 0;
        int start = 1;
        int len = 1;

        while (start <= N) {
            int end = start * 10 - 1;
            int last = Math.min(N, end);

            sum += (long) (last - start + 1) * len;

            start *= 10;
            len++;
        }

        System.out.println(sum);
    }
}