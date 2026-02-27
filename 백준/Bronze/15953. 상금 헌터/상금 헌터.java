import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static final int[] FIRST_CNT  = {1, 2, 3, 4, 5, 6};
    static final int[] FIRST_MONEY= {5_000_000, 3_000_000, 2_000_000, 500_000, 300_000, 100_000};

    static final int[] SECOND_CNT  = {1, 2, 4, 8, 16};
    static final int[] SECOND_MONEY= {5_120_000, 2_560_000, 1_280_000, 640_000, 320_000};

    static int prize(int rank, int[] cnt, int[] money) {
        if (rank == 0) return 0;
        int sum = 0;
        for (int i = 0; i < cnt.length; i++) {
            sum += cnt[i];
            if (rank <= sum) return money[i];
        }
        return 0;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int ans = prize(a, FIRST_CNT, FIRST_MONEY) + prize(b, SECOND_CNT, SECOND_MONEY);
            sb.append(ans).append('\n');
        }
        System.out.print(sb.toString());
    }
}