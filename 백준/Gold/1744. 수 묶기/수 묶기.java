import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<Integer> plus = new ArrayList<>();
        List<Integer> minus = new ArrayList<>();
        int zeroCount = 0;
        int oneCount = 0;

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num > 1) {
                plus.add(num);
            } else if (num < 0) {
                minus.add(num);
            } else if (num == 1) {
                oneCount++;
            } else { // num == 0
                zeroCount++;
            }
        }

        Collections.sort(plus, Collections.reverseOrder());
        Collections.sort(minus);

        long totalSum = 0;

        for (int i = 0; i < plus.size(); i += 2) {
            if (i + 1 < plus.size()) {
                totalSum += (long) plus.get(i) * plus.get(i + 1);
            } else {
                totalSum += plus.get(i);
            }
        }

        for (int i = 0; i < minus.size(); i += 2) {
            if (i + 1 < minus.size()) {
                totalSum += (long) minus.get(i) * minus.get(i + 1);
            } else {
                if (zeroCount == 0) {
                    totalSum += minus.get(i);
                }
            }
        }

        totalSum += oneCount;

        System.out.println(totalSum);
    }
}