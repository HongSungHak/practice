import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken()); 
        int J = Integer.parseInt(br.readLine()); 

        int left = 1;
        int right = M;
        long total = 0;

        for (int i = 0; i < J; i++) {
            int x = Integer.parseInt(br.readLine());

            if (x < left) {
                int dist = left - x;
                total += dist;
                left -= dist;
                right -= dist;
            } else if (x > right) {
                int dist = x - right;
                total += dist;
                left += dist;
                right += dist;
            }
        }
        System.out.println(total);
    }
}