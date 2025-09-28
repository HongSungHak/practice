import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    private static final int OFFSET = 1000000;
    private static final int MAX_RANGE = 2 * OFFSET + 1; 

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int[] count = new int[MAX_RANGE];
        
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            count[num + OFFSET]++;
        }

        for (int i = 0; i < MAX_RANGE; i++) {
            while (count[i] > 0) {
                bw.write((i - OFFSET) + "\n");
                count[i]--;
            }
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}