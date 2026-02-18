import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        StringTokenizer st = new StringTokenizer(br.readLine());

        char first = st.nextToken().charAt(0);
        boolean result = true;

        for (int i = 1; i < N; i++) {
            if (st.nextToken().charAt(0) != first) {
                result = false;
                break;
            }
        }

        System.out.println(result ? 1 : 0);
    }
}