import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sources = Integer.parseInt(br.readLine());
        int needNum = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[sources];
        for (int i = 0; i < sources; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int count = 0;
        int start = 0;
        int end = sources - 1;
        while (start < end) {
            if (arr[start] + arr[end] < needNum) {
                start++;
            } else if (arr[start] + arr[end] > needNum) {
                end--;
            } else {
                count++;
                start++;
                end--;
            }
            if(start > end) break;
        }
        System.out.println(count);
    }
}