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
            char[] arr1 = st.nextToken().toCharArray();
            char[] arr2 = st.nextToken().toCharArray();

            int idx = 0;
            for (int i = 0; i < arr2.length; i++) {
                if (idx < arr1.length && arr1[idx] == arr2[i]) {
                    idx++;
                }
            }

            if (idx == arr1.length) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}