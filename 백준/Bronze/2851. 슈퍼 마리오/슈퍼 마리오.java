import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        int sum = 0;
        int close = 0;

        for (int i = 0; i < 10; i++) {
            sum += Integer.parseInt(br.readLine());
            arr[i] = sum;

            if (Math.abs(100 - sum) < Math.abs(100 - close)) {
                close = sum;
            } else if (Math.abs(100 - sum) == Math.abs(100 - close)) {
                // 거리가 같다면 더 큰 값을 선택
                close = Math.max(close, sum);
            }
        }

        System.out.println(close);
    }
}
