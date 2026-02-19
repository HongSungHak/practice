import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());
        long sum = 0;
        int maxNum = 0;
        for (int i = 1; sum <= N; i++) {
            sum += i;
            maxNum = i;
        }
        System.out.println(maxNum - 1);
    }
}