import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String baekjoon = br.readLine();
        String[] arr = new String[baekjoon.length()];
        for (int i = 0; i < baekjoon.length(); i++) {
            arr[i] = baekjoon.substring(i, baekjoon.length());
        }
        Arrays.stream(arr).sorted().forEach(System.out::println);
    }
}