import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int count = 0;
        int max = arr[N-1];
        for (int i = N-2; i >= 0; i--) {
            if (max < arr[i]) {
                count++;
                max = arr[i];
            }
        }
        System.out.println(count+1);
    }
}
