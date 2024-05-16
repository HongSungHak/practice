import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputNum = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[inputNum];
        int count = 0;
        for (int i = 0; i < inputNum; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int targetNum = Integer.parseInt(br.readLine());
        Arrays.sort(arr);
        for (int i = 0; i < inputNum; i++) {
            for (int j = i + 1; j < inputNum; j++) {
                if (arr[i] + arr[j] > targetNum) {
                    break;
                }
                if (arr[i] + arr[j] == targetNum) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}