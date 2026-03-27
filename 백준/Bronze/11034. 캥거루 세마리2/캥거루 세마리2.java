import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(line);
            int[] arr = new int[3];
            int cnt1 = 0;
            int cnt2 = 0;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            while (arr[0] < arr[1] ) {
                if (arr[0] + 1 < arr[1]) {
                    cnt1++;
                    arr[0]++;
                } else break;
            }
            while (arr[1] < arr[2]) {
                if (arr[1] + 1 < arr[2]) {
                    cnt2++;
                    arr[2]--;
                } else break;
            }
            System.out.println(Math.max(cnt1, cnt2));
        }
    }
}