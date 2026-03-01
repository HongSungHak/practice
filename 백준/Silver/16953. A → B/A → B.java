import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long before = Long.parseLong(st.nextToken());
        long after = Long.parseLong(st.nextToken());
        int count = 1;
        while (before < after) {
            if (after % 10 == 1) {
                after /= 10;
            } else if (after % 2 == 0){
                after /= 2;
            } else {
                break;
            }
            count++;
        }
        if (before == after) {
            System.out.println(count);
        } else {
            System.out.println(-1);
        }
    }
}