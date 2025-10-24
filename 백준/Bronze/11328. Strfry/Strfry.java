import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine().trim());

            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());

                String strA = st.nextToken();
                String strB = st.nextToken();

                if (isValidateArray(strA, strB)) {
                    System.out.println("Possible");
                } else {
                    System.out.println("Impossible");
                }
            }
        }
    }
    private static boolean isValidateArray(String A, String B) {
        if (A.length() != B.length()) {
            return false;
        }
        int[] counts = new int[26];
        for (char c : A.toCharArray()) {
            counts[c - 'a']++;
        }
        for (char c : B.toCharArray()) {
            counts[c - 'a']--;
        }
        for (int count : counts) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}