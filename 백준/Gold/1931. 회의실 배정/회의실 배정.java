import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] meeting = new int[N][2];
        int count = 1;
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            meeting[i][0] = start;
            meeting[i][1] = end;
        }
        Arrays.sort(meeting, Comparator.comparingInt((int[] a) -> a[1])
                .thenComparingInt(a -> a[0]));
        int endTime = meeting[0][1];
        for (int i = 1; i < N; i++) {
            if (meeting[i][0] >= endTime) {
                count++;
                endTime = meeting[i][1];
            }
        }
        System.out.println(count);
    }
}
