import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int targetNum = Integer.parseInt(br.readLine());
        int result = 0;

        for (int i = 1; i < targetNum; i++) {
            int sum = i;
            int temp = i;

            while (temp != 0) {
                sum += temp % 10;
                temp /= 10;
            }
            if (sum == targetNum) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}