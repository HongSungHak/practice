import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        String[] parts = word.split("\\.", -1);

        StringBuilder result = new StringBuilder();
        boolean possible = true;

        for (int i = 0; i < parts.length; i++) {
            String part = parts[i];

            if (!part.isEmpty()) {
                if (part.length() % 2 != 0) {
                    possible = false;
                    break;
                }

                int len = part.length();
                int numA = len / 4;
                int numB = (len % 4) / 2;

                result.append("AAAA".repeat(numA));
                result.append("BB".repeat(numB));
            }

            if (i < parts.length - 1) {
                result.append('.');
            }
        }

        if (possible) {
            System.out.println(result);
        } else {
            System.out.println(-1);
        }
    }
}