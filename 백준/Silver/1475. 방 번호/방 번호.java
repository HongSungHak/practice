import java.io.*;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] cnt = new int[10];
        for (char c : br.readLine().toCharArray()) {
            cnt[c - '0']++;
        }
        cnt[6] = (int) Math.ceil((cnt[6] + cnt[9]) / 2.0);
        cnt[9] = 0;
        System.out.println(Arrays.stream(cnt).max().getAsInt());;
    }
}
