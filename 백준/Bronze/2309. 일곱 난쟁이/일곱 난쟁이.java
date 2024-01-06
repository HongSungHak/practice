import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        int num1 = 0;
        int num2 = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        int sum = Arrays.stream(arr).sum();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (sum - (arr[i] + arr[j]) == 100) {
                    num1 = arr[i];
                    num2 = arr[j];
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(num1 == arr[i] || num2 == arr[i]) continue;
            System.out.println(arr[i]);
        }
    }
}