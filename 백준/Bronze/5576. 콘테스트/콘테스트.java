import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] K = new int[10];
        int[] W = new int[10];
        for (int i = 0; i < 10; i++) {
            K[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < 10; i++) {
            W[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(K);
        Arrays.sort(W);
        int kTotal = Arrays.stream(K, 7, 10).sum();
        int wTotal = Arrays.stream(W, 7, 10).sum();
        System.out.println(kTotal + " " + wTotal);
    }
}