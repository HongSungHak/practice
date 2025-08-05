import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int targetNum = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int startIndex = 0;
        int endIndex = N - 1;
        int count = 0;
        while (startIndex < endIndex) {
            if (arr[startIndex] + arr[endIndex] == targetNum) {
                count++;
                startIndex++;
                endIndex--;
            } else if (targetNum > arr[startIndex] + arr[endIndex]) {
                startIndex++;
            } else {
                endIndex--;
            }
        }
        System.out.println(count);
    }
}