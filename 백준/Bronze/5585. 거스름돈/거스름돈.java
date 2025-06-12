import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] exchange = {500, 100, 50, 10, 5, 1};
        int money = 1000 - N;
        int count = 0;
        for (int i : exchange) {
            if (money == 0) break;
            count += money / i;
            money %= i;
        }
        System.out.println(count);
    }
}
