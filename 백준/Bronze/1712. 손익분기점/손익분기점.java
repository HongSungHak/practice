import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        long C = Long.parseLong(st.nextToken());
        long cost = A;
        long price = C - B;
        long day = 0;
        if (price <= 0) {
            day = -1;
        } else {
            day = cost / price + 1;
        }
        System.out.println(day);
    }
}