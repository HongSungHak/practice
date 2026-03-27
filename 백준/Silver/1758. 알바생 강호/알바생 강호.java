import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[T];
        long sum = 0;
        for (int i = 0; i < T; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr, Comparator.reverseOrder());
        for (int i = 0; i < T; i++) {
            int tip = arr[i] - (i + 1 - 1);
            if (tip <= 0) continue;
            sum += tip;
        }
        System.out.println(sum);
    }
}