import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    static int[] arr;
    static int max = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int targetNum = Integer.parseInt(br.readLine());
        arr = new int[targetNum];

        for (int i = 0; i < targetNum; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(arr);

        for (int i = 0; i < targetNum; i++) {
            int weight = arr[i] * (targetNum - i);  
            if (weight > max) {
                max = weight;
            }
        }

        System.out.println(max);
    }
}
