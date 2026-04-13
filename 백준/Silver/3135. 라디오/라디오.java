import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(br.readLine());
        int min = Math.abs(a - b);
        for (int i = 0; i < T; i++) {
            int x = Integer.parseInt(br.readLine());
            min = Math.min(min, 1 + Math.abs(x - b));
        }
        System.out.println(min);
    }
}