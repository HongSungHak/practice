import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int inputNum = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < inputNum; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int repeatNum = Integer.parseInt(st.nextToken());
            String[] word = st.nextToken().split("");
            for (int k = 0; k < word.length; k++) {
                sb.append(word[k].repeat(repeatNum));
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}