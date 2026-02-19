import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = -1;
        for (int five = N / 5; five >= 0; five--) {
            int remain = N - (five * 5);
            if (remain % 3 == 0) {
                cnt = five + (remain / 3);
                break;
            }
        }
        System.out.println(cnt);
    }
}