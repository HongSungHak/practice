import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[5];
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int k = 0; k < 5; k++) {
                arr[k] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            if (arr[arr.length - 2] - arr[1] >= 4) {
                System.out.println("KIN");
            } else {
                System.out.println(IntStream
                        .range(1, arr.length - 1)
                        .map(index -> arr[index])
                        .sum());
            }
        }
    }
}