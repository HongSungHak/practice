import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int k = 0; k < 3; k++) {
            String s = br.readLine();

            int maxLen = 1;
            int currentLen = 1;


            for (int i = 1; i < 8; i++) {
                if (s.charAt(i) == s.charAt(i - 1)) {
                    currentLen++;
                } else {
                    currentLen = 1;
                }

                maxLen = Math.max(maxLen, currentLen);
            }

            System.out.println(maxLen);
        }
    }
}