import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputNum = Integer.parseInt(br.readLine());
        String inputNum2 = br.readLine();
        int sum = 0;
        for (int i = 0; i < inputNum; i++) {
            sum += inputNum2.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}