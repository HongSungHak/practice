import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        StringBuilder sb = new StringBuilder();
        for (char c : word.toCharArray()) {
            int shift = c - 'A' - 3;
            if (shift < 0) {
                shift += 26;
            }
            c = (char) ('A' + shift % 26);
            sb.append(c);        }
        System.out.println(sb);
    }
}