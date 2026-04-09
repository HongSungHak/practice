import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        if (T == 1) {
            System.out.println(0);
            return;
        }

        StringTokenizer st = new StringTokenizer(br.readLine());
        int base = Integer.parseInt(st.nextToken());
        int height = Integer.parseInt(st.nextToken());

        int maxHeight = height;
        int minHeight = height;
        int maxBase = base;
        int minBase = base;

        for (int i = 1; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            base = Integer.parseInt(st.nextToken());
            height = Integer.parseInt(st.nextToken());

            maxHeight = Math.max(maxHeight, height);
            minHeight = Math.min(minHeight, height);

            maxBase = Math.max(maxBase, base);
            minBase = Math.min(minBase, base);
        }

        System.out.println((maxBase - minBase) * (maxHeight - minHeight));
    }
}