import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        while (N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int aCount = Integer.parseInt(st.nextToken());
            int bCount = Integer.parseInt(st.nextToken());

            int[] A = readIntArray(br, aCount);
            int[] B = readIntArray(br, bCount);

            Arrays.sort(B);

            long count = 0;
            for (int a : A) {
                int index = findCount(B, a);
                count += index;
            }
            System.out.println(count);
        }
    }

    private static int[] readIntArray(BufferedReader br, int size) throws IOException {
        int[] arr = new int[size];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        return arr;
    }

    private static int findCount(int[] arr, int value) {
        int left = 0;
        int right = arr.length - 1;
        int index = 0;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] < value) {
                left = mid + 1;
                index = left;
            } else {
                right = mid - 1;
            }
        }
        return index;
    }
}