import java.io.*;
import java.util.*;


public class Main {
    private static final int SIZE = 8;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[SIZE][2];
        for (int i = 0; i < SIZE; i++) {
            arr[i][0] = Integer.parseInt(br.readLine());
            arr[i][1] =  i + 1;
        }

        Arrays.sort(arr, (a, b) -> b[0] - a[0]);

        int sum = 0;
        int[] result = new int[5];

        for (int i = 0; i < 5; i++) {
            sum += arr[i][0];
            result[i] = arr[i][1];
        }

        Arrays.sort(result);

        System.out.println(sum);
        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}
