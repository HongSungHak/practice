import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[][] arr = new int[T][2];
        for (int i = 0; i < T ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[i][0] = a;
            arr[i][1] = b;
        }
        Arrays.sort(arr, Comparator.comparingInt((int[] o) -> o[0]));
        int result = arr[0][0] + arr[0][1];
        for (int i = 1; i < T; i++) {
            result = Math.max(result, arr[i][0]) + arr[i][1];
        }
        System.out.println(result);
    }
}