import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringBuilder sb = new StringBuilder();
        int index = 0;
        for (int i = 1; i <= (s.length() / 10); i++) {
            sb.append(s.substring((i - 1) * 10, i * 10) + "\n");
            index = i;
        }
        sb.append(s.substring(index * 10, s.length()));
        System.out.println(sb);
    }
}