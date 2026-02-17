import java.util.*;
import java.io.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        int[] ints = new int[1000000];
        int index = 0;
        for (int i = 1; i <= 1000; i++) {
            for (int j = 0; j < i; j++) {
                ints[index++] = i;
            }
        }
        int sum = IntStream.range(start - 1, end).map(i -> ints[i]).sum();
        System.out.println(sum);

    }
}