import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[T];
        int[] result = new int[T];
        for (int i = 0; i < T; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < T; i++) {
            int count = 0;
            for (int k = i + 1; k < T; k++) {
                if (arr[i] > arr[k]) count++;
                else break;
            }
            result[i] = count;
        }
        System.out.println(Arrays.stream(result).max().getAsInt());
    }
}