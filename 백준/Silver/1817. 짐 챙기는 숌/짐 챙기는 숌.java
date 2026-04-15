import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        int limit = Integer.parseInt(st.nextToken());
        if (T == 0) {
            System.out.println(0);
            return;
        }
        int[] arr = new int[T];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < T; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int box = 0;
        int weight = 0;
        for (int i = 0; i < T; i++) {
            if (weight + arr[i] <= limit) {
                weight += arr[i];
            } else {
                box++;
                weight = arr[i];
            }
        }
        box++;
        System.out.println(box);
    }
}