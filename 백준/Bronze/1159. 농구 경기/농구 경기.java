import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] count = new int[26];
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            char firstChar = br.readLine().charAt(0);
            count[firstChar - 'a']++;
        }

        boolean hasResult = false;
        for (int i = 0; i < 26; i++) {
            if (count[i] >= 5) {
                System.out.print((char) (i + 'a'));
                hasResult = true;
            }
        }

        if (!hasResult) {
            System.out.println("PREDAJA");
        }
    }
}
