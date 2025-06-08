import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringBuilder sb = new StringBuilder();
            String[] words = br.readLine().split(" ");
            for (int j = words.length - 1; j >= 0; j--) {
                sb.append(words[j]).append(" ");
            }
            System.out.println("Case #" + (i+1) + ": " + sb);
        }
    }
}